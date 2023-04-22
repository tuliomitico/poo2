package rpg;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Director director = new Director();
        PersonagemBuilder builder = new PersonagemBuilder();
        PersonagemBuilder randomBuilder = new PersonagemBuilder();
        director.constructBandido(builder);
        Personagem personagem = builder.character();
        System.out.println(personagem.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo! Contrua seu personagem ou deixe que a máquina escolha aleatoriamente, escolha o nome pelo menos");
        System.out.println("Digite o nome do personagem");
        String nome = sc.next();
        System.out.println("1-Manual");
        System.out.println("2-Aleatório");
        int option = sc.nextInt();
        if (option == 2) {
            director.constructAleatorio(randomBuilder,nome);
            Personagem randomPersonagem = randomBuilder.character();
            System.out.println(randomPersonagem.toString());
        }


        System.out.printf("Escolha a sua classe: 0-%s, 1-%s, 2-%s, 3-%s, 4-%s, 5- %s\n",
                Profissao.GUERREIRO,
                Profissao.MAGO,
                Profissao.ANAO,
                Profissao.FEITICEIRO,
                Profissao.BRUXO,
                Profissao.BANDIDO
        );
        int indexKlasse = sc.nextInt();
        Profissao klasse = Profissao.values()[indexKlasse];
        System.out.printf(
                "Escolha seu equipamento: 0-%s, 1-%s, 2-%s, 3-%s, 4-%s, 5-%s, 6-%s, 7-%s, 8-%s\n",
                Equipamento.ESPADA,
                Equipamento.FACA,
                Equipamento.VARINHA,
                Equipamento.LIVRO,
                Equipamento.LANÇA,
                Equipamento.MACHADO,
                Equipamento.PUNHAL,
                Equipamento.ANEL,
                Equipamento.LUVA
        );
        int indexEquip = sc.nextInt();
        Equipamento equip = Equipamento.values()[indexEquip];
        director.construct(builder,nome,klasse,equip);
        personagem = builder.character();
        System.out.println(personagem.toString());
    }
}
