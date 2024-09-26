package package01;

import java.util.Scanner;

public class Exercicio03 {
    public void exercicio03(){
        Scanner input = new Scanner(System.in);

            int sexo, contribuicao, idade;
            int ano = 2019;
            int pontuacaoMinima, pontuacaoMaxima, pontuacaoObtida;

            System.out.print("Informe o sexo (1 - feminino, 2 - masculino): ");
            sexo = input.nextInt();
            System.out.print("Informe o tempo de contribuição em 2019 (em anos): ");
            contribuicao = input.nextInt();
            System.out.print("Informe a idade em 2019: ");
            idade = input.nextInt();
            
            pontuacaoMinima = (sexo == 1) ? 86 : 96;
            pontuacaoMaxima = (sexo == 1) ? 100 : 105;
            
            pontuacaoObtida = idade + contribuicao;

            System.out.println("Ano    Pontuação Mínima    Pontuação Obtida");
            
            while (pontuacaoObtida < pontuacaoMinima && pontuacaoMinima <= pontuacaoMaxima) {
                System.out.printf("%d    %d                   %d%n", ano, pontuacaoMinima, pontuacaoObtida);
                
                ano++;
                pontuacaoMinima++;
                pontuacaoObtida += 2;
            }

            System.out.printf("%d    %d                   %d%n", ano, pontuacaoMinima, pontuacaoObtida);
        
        input.close();
    }
}
