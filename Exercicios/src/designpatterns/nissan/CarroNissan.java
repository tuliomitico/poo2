package designpatterns.nissan;

import designpatterns.Carro;

public class CarroNissan implements Carro {

    @Override
    public String dirigir() {
        return "Vrum! Booomm!";
    }
}
