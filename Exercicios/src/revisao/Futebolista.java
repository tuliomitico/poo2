package revisao;

public class Futebolista extends Atleta {

    public Futebolista(String nome, short idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void jogar() {
        System.out.println(getNome() + " está jogando futebol.");
    }
}

