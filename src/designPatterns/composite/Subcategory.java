package designPatterns.composite;

import magazyn.Towar;

import java.util.stream.Collectors;

// Leaf
public class Subcategory extends Component {
    public Subcategory(String name) {
        super(name);
    }

    @Override
    public void printCategory(String s, int count) {
        String repeat = s.repeat(count);
        System.out.printf("""
                %s-%s
                %s%s-%s
                """, repeat, name, repeat, s,
                goods.stream().map(Towar::getNazwa).collect(Collectors.joining(", ")));
    }
}
