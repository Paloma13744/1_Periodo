
package l04_array_0056518_qx.java;

import java.util.Scanner;

public class L04_Array_0056518_Q4 {
    public static void main(String[] args) {
  Scanner leia = new Scanner(System.in);
  int vet[]= new int[10],aux=0;
  int vet_m[] = new int[3];
  for (int i = 0; i < 10; i++) {
            System.out.println("Digite o "+ (i+1) + "ºnúmero:");
            vet[i] = leia.nextInt();
  }
  for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          if(vet[i] > vet[j]){
          aux = vet[i];
          vet[i] = vet[j];
          vet[j] = aux;
      }
    }
  }
        for (int i = 0; i < 3; i++) {
            vet_m[i]= vet[i];
        }
        System.out.println("Os três maiores valores são:");
        for (int i = 0; i < 3; i++) {
            System.out.print(vet_m[i] + " ");
        }     
  leia.close();
  }
    }
  
   
    

   
    

 
    
