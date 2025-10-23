 /*Faça um programa que receba do teclado dois valores do tipo real
denominados nota1 e nota2, estes correspondem as notas que um aluno
obteve no curso de lógica da Treina Recife. Após o recebimento calcule e
exiba na tela a a mensagem “A média Calculada foi:” acrescido da média
aritmética calculada das notas recebidas.  */

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    //entrada
    Scanner entrada= new Scanner(System.in); 
    System.out.println("insira o nome do aluno:");
    String nome = entrada.nextLine();
    System.out.println("insira nota 1:");
    Double nota1= entrada.nextDouble();
    System.out.println("insira nota 2:");
    Double nota2= entrada.nextDouble();
    
    //processamento 
    Double media= (nota1+nota2)/2;
   
    //saida
    System.out.println("Aluno:"+ nome + "  media:"+media);      
    entrada.close();

  }
}
