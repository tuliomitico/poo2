package revisao;

public abstract class Atleta {
    private String nome;
    private short idade;
    private float peso;
    private float altura;

    public Atleta(String nome, short idade, float peso, float altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }
    void aquecer(int minutosAquecimento) {
        System.out.printf("%s minutos treinados", minutosAquecimento);
    }
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
