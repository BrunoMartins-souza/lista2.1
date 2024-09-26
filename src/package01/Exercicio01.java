/*
    Escreva um programa que:
 • leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno de um determinado curso;
 • determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas;
 • assuma que não exista dois ou mais alunos com a mesma nota; 
 */

package package01;

import java.util.Scanner;

public class Exercicio01 {
    public void exercicio01(){
        Scanner input = new Scanner(System.in);

            int matricula;
            Double nota;
            int maiorMatricula01 = 0;
            Double maiorNota01 = 0.0;
            int maiorMatricula02 = 0;
            Double maiorNota02 = 0.0;

            for (int i = 0; i < 3; i++){
                System.out.println("Informe a nota do aluno " + (i + 1) + ":");
                    nota = input.nextDouble();
                System.out.println("Informe o número da matricula do aluno " + (i + 1) + ":");
                    matricula = input.nextInt();

                if (nota > maiorNota01) {
                    maiorNota02 = maiorNota01;
                    maiorMatricula02 = maiorMatricula01;

                    maiorNota01 = nota;
                    maiorMatricula01 = matricula;

                }else if (nota > maiorNota02) {
                    maiorNota02 = nota;
                    maiorMatricula02 = matricula;
                }
            }
            System.out.println("Aluno com a maior nota:");
            System.out.println("Matricula: " + maiorMatricula01 + " - Nota: " + maiorNota01);

            System.out.println("Aulo com seguna maior nota:");
            System.out.println("Matricula: " + maiorMatricula02 + " - Nota: " + maiorNota02);
        input.close();
    }
}
