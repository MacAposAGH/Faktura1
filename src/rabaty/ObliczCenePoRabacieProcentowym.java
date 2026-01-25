package rabaty;

import main.Singleton;

public class ObliczCenePoRabacieProcentowym implements Strategy {
    @Override
    public double obliczCenePoRabacie(double cena) {
        Singleton instance = Singleton.getInstance();
        return cena * (1 - instance.getProcentRabatu() / 100);
    }
}
