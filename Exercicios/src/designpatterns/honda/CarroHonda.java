package designpatterns.honda;

import designpatterns.Carro;

public class CarroHonda implements Carro {
    @Override
    public String dirigir() {
        return "Vrum Vrum";
    }
}
