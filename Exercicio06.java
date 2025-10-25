/*Elabore um programa que calcule o consumo médio de um automóvel sendo
fornecidos a distância total percorrida (em Km) e o total de combustível
gasto (em litros), ambos, por intermédio do teclado. Sabe-se que o consumo
médio de um automóvel é obtido pela razão entre a distância total
percorrida e o total de combustível gasto no percurso. Portanto, apresente
após o recebimento o valor que do consumo médio do automóvel, seguido
da mensagem "km/l". */

import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("informe a distancia em km:");
    int distanciaTotal=sc.nextInt();
   
    System.out.println("informe o consumo em litros:");
    double consumoTotal=sc.nextDouble();
   
    double consumoMedio=distanciaTotal/consumoTotal;
    System.out.println("o consumo medio total foi de: "+consumoMedio);
    sc.close();

  }
}
