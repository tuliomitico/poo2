package revisao;

import java.util.Calendar;
import java.util.Date;

public abstract class Atleta implements Comparable<Atleta> {
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
        System.out.println(minutosAquecimento + " minutos treinados");
    }
    public abstract void jogar();

    public static Date calcularProximaOlimpiada() {
        // Configura a data da próxima Olimpíada
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2024);
        cal.set(Calendar.MONTH, Calendar.JULY);
        cal.set(Calendar.DAY_OF_MONTH, 26);

        // Calcula a diferença em dias entre a data atual e a data da próxima Olimpíada
        long diferenca = (cal.getTimeInMillis() - System.currentTimeMillis()) / (1000 * 60 * 60 * 24);

        // Imprime na tela a quantidade de dias restantes para a próxima Olimpíada
        System.out.println("Faltam " + diferenca + " dias para a próxima Olimpíada");

        // Retorna um objeto Date com a data da próxima Olimpíada
        return cal.getTime();
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

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    @Override
    public int compareTo(Atleta outroAtleta) {
        return this.nome.compareTo(outroAtleta.getNome());
    }
}
