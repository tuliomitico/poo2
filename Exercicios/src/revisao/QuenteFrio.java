package revisao;

import java.util.Scanner;

public class QuenteFrio {
    public void quenteFrio() {
        int valor = (int) (Math.random() * (100 - 1) + 1);
        Scanner sc = new Scanner(System.in);

        boolean vitoria = false;
        while (vitoria == false) {

            int chute = sc.nextInt();
        if (valor == chute) {
            System.out.println("Acertou!");
            vitoria = true;
        }
        else if (Math.abs(valor - chute) > 25) {
            System.out.println("Quente");
        }
        else if (Math.abs(valor - chute) > 50) {
            System.out.println("Frio");
        } else if (Math.abs(valor - chute) > 12) {
            System.out.println("Muito quente");


        }


    }
    }
}
