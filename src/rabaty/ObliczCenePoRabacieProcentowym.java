package rabaty;

import main.Konfiguracja;

public class ObliczCenePoRabacieProcentowym implements ObliczCenePoRabacie {
    @Override
    public double obliczCenePoRabacie(double cena) {
        Konfiguracja instance = Konfiguracja.getInstance();
        return cena * (1 - instance.getProcentRabatu() / 100);
    }
}
