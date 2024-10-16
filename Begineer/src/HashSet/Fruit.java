package HashSet;

import java.util.Objects;

public class Fruit {
    private String name;
    private int quantity;

    public Fruit() {
    }

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return quantity == fruit.quantity && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }
}
