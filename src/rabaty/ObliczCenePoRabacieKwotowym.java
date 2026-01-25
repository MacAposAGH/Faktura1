package rabaty;

import main.Singleton;

public class ObliczCenePoRabacieKwotowym implements Strategy {
    @Override
    public double obliczCenePoRabacie(double cena) {
        Singleton instance = Singleton.getInstance();
        return cena - instance.getKwotaRabatu();
    }
}
