package designpatterns;

import designpatterns.honda.HondaFactory;
import designpatterns.nissan.NissanFactory;
import designpatterns.toyota.ToyotaFactory;

public class Exercicio3 {
    public static void main(String[] args) {
        NissanFactory nissan = new NissanFactory();
        ToyotaFactory tf = new ToyotaFactory();
        HondaFactory honda = new HondaFactory();
        Carro corolla = tf.fazCarro();
        Carro sentra = nissan.fazCarro();
        Carro civic = honda.fazCarro();

        System.out.println(corolla.dirigir());
        System.out.println(sentra.dirigir());
        System.out.println(civic.dirigir());
    }
}
