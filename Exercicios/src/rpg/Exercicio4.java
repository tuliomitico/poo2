package rpg;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Director director = new Director();
        PersonagemBuilder builder = new PersonagemBuilder();
        director.constructBandido(builder);
        Personagem personagem = builder.character();
        System.out.println(personagem.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do personagem");
        String nome = sc.next();
    }
}
