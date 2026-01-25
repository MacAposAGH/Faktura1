package main;

import designPatterns.templateMethod.PrintInEnglish;
import designPatterns.templateMethod.PrintInFrench;
import designPatterns.templateMethod.PrintInPolish;
import designPatterns.templateMethod.TemplateMethodAbstractClass;
import dokumenty.Faktura;
import magazyn.Towar;
import rabatlosowy.LosowyRabat;

import java.util.Calendar;

public class Ui {

    public static void main(String[] args) {
        Calendar teraz = Calendar.getInstance();

        //Tworzymy towary
        Towar t1 = new Towar(10, "buty");
        Towar t2 = new Towar(2, "skarpety");

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
