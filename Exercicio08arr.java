import java.util.Arrays;

public class Exercicio08arr {
  public static void main(String[] args) {
    int[]numeros={1,2,3,4,5};
    int[]numeros2={1,2,3,4,5,6,7,8,9,10};
    int[] numeros3 = new int[numeros.length + numeros2.length];

    for (int i=0; i<numeros.length;i++){
      numeros3[i]=numeros[i];
    }

    for(int i=0; i<numeros2.length; i++){
      numeros3[i+numeros.length]=numeros2[i];
    }

    for(int i =0; i<numeros3.length; i++){
      for(int j =i + 1; j<numeros3.length; j++){
        if(numeros3[i]==numeros3[j]){
          numeros3[i]=0;
        }
      }
    }

    System.out.println(Arrays.toString(numeros3));

 
  }
}
