package designPatterns;

import designPatterns.adapter.ClassAdapter;
import designPatterns.adapter.ObjectAdapter;
import rabaty.Strategy;

//Konfiguracja
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

    public Strategy getObliczanieRabatu(){
//        return new ObjectAdapter();
        return new ClassAdapter();
    }
}
