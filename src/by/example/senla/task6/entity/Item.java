package by.example.senla.task6.entity;

import java.util.Objects;

public class Item {

    private String title;
    private int weight;
    private int cost;

    public Item(String title, int weight, int cost) {
        this.title = title;
        this.weight = weight;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight &&
                cost == item.cost &&
                Objects.equals(title, item.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, weight, cost);
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
