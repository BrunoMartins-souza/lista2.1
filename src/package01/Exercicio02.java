/*
 Dada a seguinte série: 1,4,4,2,5,5,3,6,6,4,7,7,..., escreva um programa que seja capaz de gerar os primeiros n−ésimos termos da mesma. 
 Esse número n deve ser lido do teclado. No exemplo citado, n = 4
 */

package package01;

import java.util.Scanner;

public class Exercicio02 {
    public void exercicio02(){
        Scanner input = new Scanner(System.in);

        int n;
        int valorImpar = 1;
        int valorPar = 4;

        System.out.println("Digite o valor de n: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){

            if(i % 3 == 1){
                System.out.print(valorImpar + ", ");
                valorImpar++;
            }else{
                System.out.print(valorPar + ", ");
            }
            if (i % 3 == 0) {
                valorPar++;
            }
        }
    }
}
