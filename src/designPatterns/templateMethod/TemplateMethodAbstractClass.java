package designPatterns.templateMethod;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public abstract class TemplateMethodAbstractClass {
    Faktura faktura;

    public TemplateMethodAbstractClass(Faktura faktura) {
        this.faktura = faktura;
    }

    public abstract void drukujNaglowek();

    public abstract void drukujPozycje();

    protected void concreteDrukujNaglowek(String dated, String issuedTo, String amount) {
        System.out.printf("%s: %s\n%s: %s\n%s: %s\n", dated, faktura.getDataSprzedazy().toString(),
                issuedTo, faktura.getKontrahent(),amount, faktura.getSuma());
    }

    protected void concreteDrukujPozycje(String good, String quantity, String value) {
        Iterator<Pozycja> iteratorPozycji = faktura.getIteratorPozycji();
        while (iteratorPozycji.hasNext()) {
            Pozycja pozycja = iteratorPozycji.next();
            System.out.printf("%s: %s %s: %s %s: %s\n", good, pozycja.getNazwa(), quantity, pozycja.getIlosc(),
                    value, pozycja.getWartosc());
        }
    }

    public void drukujFakture() {
        System.out.println("=====================================================");
        drukujNaglowek();
        drukujPozycje();
        System.out.println("=====================================================");
    }
}
