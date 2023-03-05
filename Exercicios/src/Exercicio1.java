public class Exercicio1 {
    public static void main(String[] args) {
        String palavra = "Verdade";
        String dois_chars = "de";
        ComparaStrings comparador = new ComparaStrings();
        FrequenciaDeLetras freq = new FrequenciaDeLetras();
        System.out.println(comparador.compara_strings(palavra,dois_chars));
        freq.conta_letras("Arara");
        QuenteFrio qf = new QuenteFrio();
        qf.quenteFrio();
    }
}
