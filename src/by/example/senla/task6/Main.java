package by.example.senla.task6;

import by.example.senla.task6.entity.Backpack;
import by.example.senla.task6.entity.Item;
import by.example.senla.task6.logic.BackpackLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BackpackLogic backpackLogic = new BackpackLogic();
        Backpack backpack = new Backpack(7);
        List<Item> items = new ArrayList<>();
        items.add(new Item("item1", 5, 5));
        items.add(new Item("item2", 3, 1));
        items.add(new Item("item3", 2, 1));
        items.add(new Item("item4", 4, 7));

        backpackLogic.addBestItems(backpack, items);

        System.out.println("Total cost of items " + backpackLogic.findCostOfItems(backpack));
        System.out.println("Total weight of items " + backpackLogic.findWeightOfItems(backpack));

        System.out.println("Items in the backpack:");
        for (Item item: backpack.getItems()) {
            System.out.print(item.getTitle() + " ");
            System.out.print("weight = " + item.getWeight() + " ");
            System.out.println("cost = " + item.getCost());
        }
    }
}
