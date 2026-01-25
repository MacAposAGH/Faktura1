package main;

import rabaty.Strategy;
import rabaty.ObliczCenePoRabacieProcentowym;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public double getKwotaRabatu(){
        return 5;
    }

    public double getProcentRabatu(){
        return 70;
    }

    public Strategy getAtkualnyRabat(){
        return new ObliczCenePoRabacieProcentowym();
//        return new ObliczCenePoRabacieKwotowym();
    }
}
