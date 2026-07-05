package part5.stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> elements = new ArrayList<>();

    public void add(String value) {
        elements.add(value);
    }

    public String take() {
        int index = elements.size() - 1;
        String lastElement = elements.get(index);
        elements.remove(index);
        return lastElement;
    }

    public boolean isEmpty() {
        if(this.elements == null) {
            return true;
        }
        return this.elements.isEmpty();
    }

    public ArrayList<String> values() {
        return elements;
    }
}
