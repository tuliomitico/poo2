package revisao;
public class Tenista extends Atleta {

    public Tenista(String nome, short idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void jogar() {
        System.out.println(getNome() + " está jogando tênis.");
    }
}
