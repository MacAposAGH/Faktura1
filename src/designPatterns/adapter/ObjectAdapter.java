package designPatterns.adapter;

import designPatterns.Singleton;
import rabatlosowy.LosowyRabat;
import rabaty.Strategy;

public class ObjectAdapter implements Strategy {
    private static final LosowyRabat LOSOWY_RABAT = new LosowyRabat();

    @Override
    public double obliczCenePoRabacie(double cena) {
        double losujRabat = LOSOWY_RABAT.losujRabat();
        Singleton instance = Singleton.getInstance();
        return cena * (1 - instance.getProcentRabatu() * losujRabat / 100);
    }
}
