package designpatterns.honda;

import designpatterns.Acessorios;

public class AcessoriosHonda implements Acessorios {

    @Override
    public Acessorios fazArCondicionado() {
        return new AcessoriosHonda();
    }
}
