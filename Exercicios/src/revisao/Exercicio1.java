package revisao;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        String palavra = "Verdade";
        String dois_chars = "de";
        ComparaStrings comparador = new ComparaStrings();
        FrequenciaDeLetras freq = new FrequenciaDeLetras();
        System.out.println(comparador.compara_strings(palavra,dois_chars));
        freq.conta_letras("Arara");
        QuenteFrio qf = new QuenteFrio();
        //qf.quenteFrio();

        Atleta atleta1 = new Futebolista("Neymar Jr.", (short) 29, 68.5F, 1.75F);
        Atleta atleta2 = new Tenista("Roger Federer", (short)40, 85.0F, 1.85F);
        Atleta atleta3 = new Corredor("Usain Bolt", (short)35, 94.0F, 1.95F);

        atleta1.aquecer(15);
        atleta1.jogar();

        atleta2.aquecer(10);
        atleta2.jogar();

        atleta3.aquecer(20);
        atleta3.jogar();

        // Atleta atleta1 = new Futebolista("Neymar Jr.", 29, 68.5, 1.75);
        // Atleta atleta2 = new Tenista("Roger Federer", 40, 85.0, 1.85);
        // Atleta atleta3 = new Corredor("Usain Bolt", 35, 94.0, 1.95);
        Atleta atleta4 = new Futebolista("Cristiano Ronaldo", (short) 36, 83.0F, 1.87F);
        Atleta atleta5 = new Tenista("Rafael Nadal", (short) 35, 85.0F, 1.85F);
        Atleta atleta6 = new Corredor("Mo Farah", (short) 38, 64.0F, 1.75F);

        // Criando um vetor e uma lista de Atletas
        Atleta[] vetorAtletas = { atleta1, atleta2, atleta3, atleta4, atleta5, atleta6 };
        List<Atleta> listaAtletas = new ArrayList<>(Arrays.asList(vetorAtletas));

        // Ordenando os Atletas por nome
        Arrays.sort(vetorAtletas);
        Collections.sort(listaAtletas);

        // Percorrendo o vetor e a lista e chamando os métodos aquecer() e jogar()
        for (int i = 0; i < vetorAtletas.length; i++) {
            vetorAtletas[i].aquecer(10);
            vetorAtletas[i].jogar();
        }

        for (Atleta atleta : listaAtletas) {
            atleta.aquecer(10);
            atleta.jogar();
        }
        Atleta.calcularProximaOlimpiada();
    }
}

