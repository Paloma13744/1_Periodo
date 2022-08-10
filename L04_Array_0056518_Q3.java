
package l04_array_0056518_qx.java;

import java.util.Scanner;

public class L04_Array_0056518_Q3 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int vetor_1[]= new int[5],indice=0;
    int vetor_2[] = new int[5],auxiliar=0;
    int vetor_3[] = new int[10];
    for (int i = 0; i < 5; i++) {
    System.out.println("Digite o " + (i+1) + "ºnúmero do primeiro vetor:");
    vetor_1[i] = leia.nextInt();        
    }
    for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
            if(vetor_1[i] < vetor_1[j]){
            auxiliar = vetor_1[i];
            vetor_1[i]= vetor_1[j];
            vetor_1[j] = auxiliar;
            }
         }
    }
   for (int i = 0; i < 5; i++) {
    System.out.println("Digite o " + (i+1) + "ºnúmero do segundo vetor:");
    vetor_2[i] = leia.nextInt();   
   }
   for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) {
            if(vetor_2[i] < vetor_2[j]){
            auxiliar = vetor_2[i];
            vetor_2[i]= vetor_2[j];
            vetor_2[j] = auxiliar;
            }
         }
    }
   for (int i = 0; i < 5; i++) {
            vetor_3[indice] = vetor_1[i];
            indice++;
        }
   for (int i = 0; i <5; i++) {
            vetor_3[indice] = vetor_2[i];
            indice++;
        }
   for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 10; j++) {
            if(vetor_3[i] < vetor_3[j]){
            auxiliar = vetor_3[i];
            vetor_3[i]= vetor_3[j];
            vetor_3[j] = auxiliar;
            }
            }
   }
        System.out.println("Os elementos dos vetores anteriores são:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor_3[i] + " ");
        }
  leia.close();  
}
}