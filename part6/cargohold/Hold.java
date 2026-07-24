package part6.cargohold;

import java.util.ArrayList;
import java.util.List;

public class Hold {
    private List<Suitcase> suitcaseList =  new ArrayList<>();
    private double currentWeight;
    private double maxWeight;

    public Hold(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(currentWeight + suitcase.getCurrentWeight() > maxWeight) {
            System.out.println("There is not enough space in hold.");
            return;
        }
        suitcaseList.add(suitcase);
        this.currentWeight += suitcase.getCurrentWeight();
    }

    public void printItems() {
        for (int i=0;i<suitcaseList.size();i++) {
            suitcaseList.get(i).printItems();
        }
    }

    @Override
    public String toString() {
        return suitcaseList.size() + " suitcases " + this.getCurrentWeight() + " kg";
    }
}
