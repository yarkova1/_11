package test;

import first.Good;
import first.ListOfGoods;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    private ListOfGoods listGoods;

    @Before
    public void setUp() {
        Good good1 = new Good("Dress", 1994, 3);
        Good good2 = new Good("Bread", 4, 17);
        Good good3 = new Good("Milk", 6, 23);
        Good good4 = new Good("Car", 136, 13, 42);
        List<Good> list = new ArrayList<>();
        list.add(good1);
        list.add(good2);
        list.add(good3);
        list.add(good4);
        listGoods = new ListOfGoods(list);
    }

    @Test
    public void removeGood() {
        Good good = new Good("Cheese", 4, 5);
        listGoods.add(good);
        int size = listGoods.size();
        listGoods.remove(good);
        assertEquals(listGoods.size(), size - 1);
    }

    @Test
    public void removeGoodByID() {
        int size = listGoods.size();
        listGoods.remove(17);
        assertEquals(listGoods.size(), size - 1);
        assertNull(listGoods.get(17));
    }

    @Test
    public void removeGoodByName() {
        int size = listGoods.size();
        listGoods.remove("Milk");
        assertEquals(listGoods.size(), size - 1);
        assertNull(listGoods.get("Milk"));
    }

    @Test
    public void addGood() {
        int size = listGoods.size();
        Good good = new Good("Chocolate", 12, 21);
        listGoods.add(good);
        assertEquals(listGoods.size(), size + 1);
        assertEquals(listGoods.get("Chocolate"), good);
    }

    @Test
    public void changeCost() {
        listGoods.get("Bread").setCost(13);
        listGoods.get("Car").setCost(13,2);
        assertEquals(listGoods.get("Bread").getCost(), 13);
        assertEquals(listGoods.get("Car").getCost(), 1302);
    }

    @Test
    public void changeName() {
        listGoods.get(23).setName("Rice");
        assertEquals(listGoods.get("Rice").getId(), 23);
    }

    @Test
    public void countCostByNameAndAmount() {
        assertEquals(listGoods.price("Bread", 42), 1.68, 0.01);
        assertEquals(listGoods.price("Car", 2), 272.26, 0.01);
    }
}
