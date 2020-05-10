package by.example.senla.task6.logic;

import by.example.senla.task6.entity.Backpack;
import by.example.senla.task6.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class BackpackLogic {

    public void addBestItems(Backpack backpack, List<Item> items) {
        int capacity = backpack.getCarryingCapacity();
        int numberOfItems = items.size();
        Item currentItem;

        int[][] array = new int[numberOfItems + 1][capacity + 1];

        for (int i = 1; i < numberOfItems + 1; i++) {
            currentItem = items.get(i - 1);
            for (int j = 1; j < capacity + 1; j++) {
                if (j >= currentItem.getWeight()) {
                    array[i][j] = Math.max(array[i - 1][j], array[i - 1][j - currentItem.getWeight()] + currentItem.getCost());
                } else {
                    array[i][j] = array[i - 1][j];
                }
            }
        }

        List<Item> bestItems = new ArrayList<>();

        for (int i = numberOfItems; i > 0; i--) {
            if (array[i][capacity] != array[i - 1][capacity]) {
                bestItems.add(items.get(i - 1));
                capacity -= items.get(i - 1).getWeight();
            }
        }

        backpack.setItems(bestItems);
    }

    public int findWeightOfItems(Backpack backpack) {
        List<Item> items = backpack.getItems();
        int weight = 0;
        for (Item item: items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public int findCostOfItems(Backpack backpack) {
        List<Item> items = backpack.getItems();
        int cost = 0;
        for (Item item: items) {
            cost += item.getCost();
        }
        return cost;
    }
}
