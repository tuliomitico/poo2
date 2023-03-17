package designpatterns.nissan;

import designpatterns.Acessorios;
import designpatterns.Carro;
import designpatterns.CarroFactory;
import designpatterns.Motor;

public class NissanFactory implements CarroFactory {

    @Override
    public Carro fazCarro() {
        return new CarroNissan();
    }

    @Override
    public Motor fazMotor() {
        return null;
    }

    @Override
    public Acessorios fazAcessorios() {
        return null;
    }
}
