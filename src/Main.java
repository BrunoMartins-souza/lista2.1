import java.util.Scanner;

import package01.Exercicio01;
import package01.Exercicio02;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Integer opc = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println(" 1 - Resolução Exercício 01");
            System.out.println(" 2 - Resolução Exercício 02");
            System.out.println(" 3 - Resolução Exercício 03");
            System.out.println(" 4 - Sair.");
            System.out.println();
            opc = input.nextInt();
            System.out.println();

            switch (opc) {
                case 1:
                    Exercicio01 ex01 = new Exercicio01();
                    ex01.exercicio01();
                    break;
                    case 2:
                    Exercicio02 ex02 = new Exercicio02();
                    ex02.exercicio02();
                    break;

                default:
                    break;
            }

            System.out.println();

        } while (opc != 4);

        input.close();
    }
}
