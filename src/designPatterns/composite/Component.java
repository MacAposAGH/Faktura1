package designPatterns.composite;

import magazyn.Towar;

import java.util.ArrayList;
import java.util.Collection;

abstract class Component {
    public String name;

    public Collection<Towar> goods = new ArrayList<>();

    public Component(String name) {
        this.name = name;
    }

    public void addGood(Towar good){
        goods.add(good);
    }

    public void removeSubcategory(Towar good){
        goods.remove(good);
    }

    public abstract void printCategory(String s, int count);
}
