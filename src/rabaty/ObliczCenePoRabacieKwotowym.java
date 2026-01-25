package rabaty;

import konfiguracja.Konfiguracja;

public class ObliczCenePoRabacieKwotowym implements ObliczCenePoRabacie{
    @Override
    public double obliczCenePoRabacie(double cena) {
        Konfiguracja instance = Konfiguracja.getInstance();
        return cena - instance.getKwotaRabatu();
    }
}
