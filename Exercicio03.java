/*A empresa Treina Recife remunera seus professores por hora, logo precisa
que você escreva um programa que receba do teclado a quantidade de
horas trabalhadas por um professor no mês e o valor da hora trabalhada.
Calcular e exibir na tela o valor que o professor irá receber naquele mês./* */
import java.util.Scanner;

public class Exercicio03 {
   public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);//import para inputar no terminal
    //entradas
    System.out.println("insira a quantidade de horas trabalhadas: ");
    int horas=entrada.nextInt();
    System.out.println("insira o valor pago por hora: ");
    int valorPorHora=entrada.nextInt();
    //processamento
    int valorPago=horas*valorPorHora;
    //saida
    System.out.println("valor a ser pago: $"+valorPago);
    entrada.close();

  }
  
}
