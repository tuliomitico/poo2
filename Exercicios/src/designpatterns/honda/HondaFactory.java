package designpatterns.honda;

import designpatterns.Acessorios;
import designpatterns.Carro;
import designpatterns.CarroFactory;
import designpatterns.Motor;
import designpatterns.nissan.AcessoriosNissan;

public class HondaFactory implements CarroFactory {
    @Override
    public Acessorios fazAcessorios() {
        return new AcessoriosNissan();
    }

    @Override
    public Motor fazMotor() {
        return new MotorHonda();
    }

    @Override
    public Carro fazCarro() {

        return new CarroHonda();
    }
}
