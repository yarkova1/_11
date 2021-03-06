package first;

import java.util.Objects;

public class Good {

    private String name;
    private int cost;
    private int id;

    public Good(String name, int cost, int id) {
        this.name = name;
        this.cost = cost;
        this.id = id;
    }

    public Good(String name, int costRub, int costCent, int id) {
        this.name = name;
        this.cost = costCent + costRub * 100;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setCost(int costCent) {
        cost = costCent;
    }

    public void setCost(int costRub, int costCent) {
        cost = costRub * 100 + costCent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return cost == good.cost &&
                id == good.id &&
                Objects.equals(name, good.name);
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
