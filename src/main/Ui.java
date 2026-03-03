package main;

import designPatterns.composite.Category;
import designPatterns.composite.Subcategory;
import designPatterns.templateMethod.PrintInEnglish;
import designPatterns.templateMethod.TemplateMethodAbstractClass;
import dokumenty.Faktura;
import magazyn.Towar;
import rabatlosowy.LosowyRabat;

import java.util.Calendar;

public class Ui {

    public static void main(String[] args) {
        Calendar teraz = Calendar.getInstance();

        //Tworzymy towary
        Towar t1 = new Towar(10, "buty sportowe");
        Towar t2 = new Towar(10, "buty zimowe");
        Towar t3 = new Towar(20, "jeansy");
        Towar t4 = new Towar(20, "chinosy");

        //Tworzymy kategorie
        Category fashion = new Category("moda");
        Category cloths = new Category("ubrania");
        Subcategory shoes = new Subcategory("obuwie");
        shoes.addGood(t1);
        shoes.addGood(t2);
        Subcategory trousers = new Subcategory("spodnie");
        trousers.addGood(t3);
        trousers.addGood(t4);
        fashion.addSubcategory(cloths);
        cloths.addSubcategory(shoes);
        cloths.addSubcategory(trousers);

        System.out.println("Kategorie:");
        fashion.printCategory("\t", 0);

        //I przykladowa fakture
        Faktura f = new Faktura(teraz.getTime(), "Fido");
        f.dodajPozycje(t1, 3);
        f.dodajPozycje(t2, 5);

//		Facade.wypiszFakture(f);
        TemplateMethodAbstractClass printer = new PrintInEnglish(f);
        printer.drukujFakture();

        //TEST ZEWN. rabatu
        LosowyRabat lr = new LosowyRabat();
        System.out.println(lr.losujRabat());
    }


}
