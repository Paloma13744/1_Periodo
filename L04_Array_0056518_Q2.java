
package l04_array_0056518_qx.java;

import java.util.Scanner;

public class L04_Array_0056518_Q2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[20];
        int auxiliar = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i+1)+ "ºnúmero:");
            vetor[i] = leia.nextInt();     
        }
        System.out.println("Os números digitados são:");
        for (int i = 0; i < 20; i++) {
        System.out.print(vetor[i] + "  " );  
        }
        for (int i = 0; i < 20; i++) { 
            for (int j = 0; j < 20; j++) {
            if(vetor[i] < vetor[j]){
            auxiliar = vetor[i];
            vetor[i]= vetor[j];
            vetor[j] = auxiliar; 
            }
          }
        }
        System.out.print("\nOs números digitados em ordem crescente serão:");
        for (int i = 0; i <20; i++) {
        System.out.print(vetor[i] + " ");
        }
        leia.close();   
}
}
