package designPatterns.adapter;

import designPatterns.Singleton;
import rabatlosowy.LosowyRabat;
import rabaty.Strategy;

public class ClassAdapter extends LosowyRabat implements Strategy {

    @Override
    public double obliczCenePoRabacie(double cena) {
        Singleton instance = Singleton.getInstance();
        return cena * (1 - (instance.getKwotaRabatu() / 100) * losujRabat());
    }
}
