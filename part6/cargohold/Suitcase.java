package part6.cargohold;

import java.util.ArrayList;
import java.util.List;

public class Suitcase {
    private List<Item> items = new ArrayList<>();
    private final double maxWeight;
    private double currentWeight;

    public double getCurrentWeight() {
        return currentWeight;
    }

    public Suitcase(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if(currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
        else {
            System.out.println("Max weight reached");
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item haviestItem() {
        Item heaviest = new Item(null,0.0);
        for (int i = 0;i<items.size();i++) {
            if(items.get(i).getWeight() > heaviest.getWeight()) {
                heaviest = items.get(i);
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";
        }
        return items.size() + " items " + "(" + currentWeight + " kg)";
    }
}
