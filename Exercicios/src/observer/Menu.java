package observer;

import java.util.Scanner;

public class Menu {
    public void execute() throws InterruptedException {
        PrevisaoTempo previsaoTempo = new PrevisaoTempo();

        Jornal jornal = new Jornal();
        Aeroporto aeroporto = new Aeroporto();
        Agricultor agricultor = new Agricultor();

        previsaoTempo.addObserver(jornal);
        previsaoTempo.addObserver(aeroporto);
        previsaoTempo.addObserver(agricultor);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Adicionar observador");
            System.out.println("2 - Remover observador");
            System.out.println("3 - Executar");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("1 - Jornal");
                System.out.println("2 - Aeroporto");
                System.out.println("3 - Agricultor");

                int tipoObservador = scanner.nextInt();

                switch (tipoObservador) {
                    case 1:
                        previsaoTempo.addObserver(jornal);
                        break;
                    case 2:
                        previsaoTempo.addObserver(aeroporto);
                        break;
                    case 3:
                        previsaoTempo.addObserver(agricultor);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } else if (opcao == 2) {
                System.out.println("1 - Jornal");
                System.out.println("2 - Aeroporto");
                System.out.println("3 - Agricultor");

                int tipoObservador = scanner.nextInt();

                switch (tipoObservador) {
                    case 1:
                        previsaoTempo.removeObserver(jornal);
                        break;
                    case 2:
                        previsaoTempo.removeObserver(aeroporto);
                        break;
                    case 3:
                        previsaoTempo.removeObserver(agricultor);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } else if (opcao == 3) {

                    previsaoTempo.executar();

            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}

