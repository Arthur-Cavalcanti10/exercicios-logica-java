/*A Treina Recife decorrente dos recentes aumentos de custos operacionais irá
promover um aumento de 7.5% nos seus cursos de curta duração. Portanto,
elabore um programa para receber via teclado o nome do curso e o valor
atual em reais praticado. Ao final calcule e exiba o nome do curso e o novo
valor com o aumento. */

import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("informe o nome do curso:" );
    String nomeCurso=sc.nextLine();

    System.out.println("valor atual do curso: ");
    int valorAtual=sc.nextInt();

    System.out.println("informe o valor do reajuste em porcentagem (%): ");
    double porcentagem=sc.nextDouble();

    double reajuste=(porcentagem/100)*valorAtual;
    double novoValor= reajuste + valorAtual;

    System.out.println("nome do curso: " + nomeCurso);
    System.out.println("o valor com o reajuste é:"+novoValor);
    sc.close();
  }
  
}