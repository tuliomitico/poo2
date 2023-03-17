package designpatterns.toyota;

import designpatterns.*;

public class ToyotaFactory implements CarroFactory {
    @Override
    public Motor fazMotor() {
      return new MotorToyota();
    };

    @Override
    public Acessorios fazAcessorios() {
        return new AcessoriosToyota();
    }
    public Carro fazCarro() {
        return new CarroToyota();
    }
}
