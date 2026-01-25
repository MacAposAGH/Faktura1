package designPatterns.templateMethod;

import dokumenty.Faktura;

public class PrintInEnglish extends TemplateMethodAbstractClass {

    public PrintInEnglish(Faktura faktura) {
        super(faktura);
    }

    @Override
    public void drukujNaglowek() {
        concreteDrukujNaglowek("FA dated", "Issued to", "Amount");
    }

    @Override
    public void drukujPozycje() {
        concreteDrukujPozycje("Goods","Quantity","Value");
    }
}