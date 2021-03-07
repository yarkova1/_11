package first;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoods {
    private final List<Good> list = new ArrayList<>();

    public ListOfGoods(List<Good> newList) {
        this.list.addAll(newList);
    }

    public void add(Good good) {
        list.add(good);
    }

    public Good get(String name){
        for (Good good: list) {
            if (good.getName().equals(name)) {
                return good;
            }
        }
        return null;
    }

    public Good get(int id) {
        for (Good good: list) {
            if (good.getId() == id) {
                return good;
            }
        }
        return null;
    }

    public void remove(Good good) {
        list.remove(good);
    }

    public void remove(int id) {
        list.removeIf(CurrentGood -> CurrentGood.getId() == id);
    }

    public void remove(String name) {
        list.removeIf(CurrentGood -> CurrentGood.getName().equals(name));
    }

    public float price(String name, int amount) {
        return ((float)(get(name).getCost() * amount)) / 100;
    }

    public int size() {
        return list.size();
    }
}
