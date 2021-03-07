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
        List<Good> list = new ArrayList<>();
        list.add(good1);
        list.add(good2);
        list.add(good3);
        listGoods = new ListOfGoods(list);
    }

    @Test
    public void whenRemoveGoodWhenRemoveGoodByName() {
        int size = listGoods.size();
        System.out.println(size);
        listGoods.remove("Milk");
        assertEquals(listGoods.size(), size - 1);
    }
}
