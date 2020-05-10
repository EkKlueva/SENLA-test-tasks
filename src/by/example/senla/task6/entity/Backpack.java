package by.example.senla.task6.entity;

import java.util.List;
import java.util.Objects;

public class Backpack {

    private int carryingCapacity;
    private List<Item> items;

    public Backpack(int carryingCapacity, List<Item> items) {
        this.carryingCapacity = carryingCapacity;
        this.items = items;
    }

    public Backpack(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return carryingCapacity == backpack.carryingCapacity &&
                Objects.equals(items, backpack.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carryingCapacity, items);
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "carryingCapacity=" + carryingCapacity +
                ", items=" + items +
                '}';
    }
}
