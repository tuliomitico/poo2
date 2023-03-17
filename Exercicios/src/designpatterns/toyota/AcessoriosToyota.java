package designpatterns.toyota;

import designpatterns.Acessorios;

public class AcessoriosToyota implements Acessorios {
    public Acessorios fazArCondicionado() {
        return new AcessoriosToyota();
    }
}
