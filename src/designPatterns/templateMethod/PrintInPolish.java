package designPatterns.templateMethod;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public class PrintInPolish extends TemplateMethodAbstractClass {

    public PrintInPolish(Faktura faktura) {
        super(faktura);
    }

    @Override
    public void drukujNaglowek() {
        concreteDrukujNaglowek("FA z dnia", "Wystawiona dla", "Na kwote");
    }

    @Override
    public void drukujPozycje() {
        concreteDrukujPozycje("Towar","Ilosc","Wartosc");
    }

}