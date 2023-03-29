package revisao;

public class Corredor extends Atleta {
    public Corredor(String nome, short idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void jogar() {
        System.out.println(getNome() + " está correndo.");
    }
}
