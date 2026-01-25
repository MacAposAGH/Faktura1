package designPatterns.templateMethod;

import dokumenty.Faktura;

public class PrintInFrench extends TemplateMethodAbstractClass {

    public PrintInFrench(Faktura faktura) {
        super(faktura);
    }

    @Override
    public void drukujNaglowek() {
        concreteDrukujNaglowek("FA du", "Émis pour", "Pour un montant de");
    }

    @Override
    public void drukujPozycje() {
        concreteDrukujPozycje("Marchandise", "Quantité", "Valeur");
    }
}