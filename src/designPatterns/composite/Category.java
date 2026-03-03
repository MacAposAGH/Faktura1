package designPatterns.composite;

import java.util.ArrayList;

// Composite
public class Category extends Component {

    private final ArrayList<Component> subcategories = new ArrayList<>();

    public Category(String name) {
        super(name);
    }

    public void addSubcategory(Component subcategory) {
        subcategories.add(subcategory);
    }

    public void removeSubcategory(Component subcategory) {
        subcategories.remove(subcategory);
    }

    public ArrayList<Component> getSubcategories() {
        return subcategories;
    }

    @Override
    public void printCategory(String s, int count) {
        System.out.println(s.repeat(count) + "-" + name);
        subcategories.forEach(component -> component.printCategory(s, count + 1));
    }
}
