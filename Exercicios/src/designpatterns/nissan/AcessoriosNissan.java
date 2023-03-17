package designpatterns.nissan;

import designpatterns.Acessorios;

public class AcessoriosNissan implements Acessorios {
    @Override
    public Acessorios fazArCondicionado() {
        return new AcessoriosNissan();
    }
}
