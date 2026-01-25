package main;

import rabaty.ObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieProcentowym;

public class Konfiguracja {
    private static Konfiguracja instance;

    private Konfiguracja() {
    }

    public static Konfiguracja getInstance() {
        if (instance == null) {
            instance = new Konfiguracja();
        }
        return instance;
    }

    public double getKwotaRabatu(){
        return 5;
    }

    public double getProcentRabatu(){
        return 70;
    }

    public ObliczCenePoRabacie getAtkualnyRabat(){
        return new ObliczCenePoRabacieProcentowym();
//        return new ObliczCenePoRabacieKwotowym();
    }
}
