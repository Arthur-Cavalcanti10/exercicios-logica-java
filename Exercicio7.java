/*Faça um programa que receba do teclado o salário fixo de um vendedor em
reais e o valor total de vendas efetuadas por ele em um determinado mês.
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas no mês, calcular e exibir o valor total a receber no final do mês. */

import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("informe o salario: ");
    double salario=sc.nextDouble();

    System.out.println("informe a valor total das vendas: ");
    double valorVendas=sc.nextDouble();

    System.out.println("informe a comissao em porcentagem: ");
    double porcentagem=sc.nextDouble();
  
    double comissao=(porcentagem/100)*valorVendas;
    double valorPagar= comissao + salario;
    sc.close();

    System.out.println("valor total a pagar:" + valorPagar);

    }
}

