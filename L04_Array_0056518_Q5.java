
package l04_array_0056518_qx.java;

import java.util.Scanner;

public class L04_Array_0056518_Q5 {
     public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     int number[] = new int [30];
        for (int i = 0; i < 30; i++) {
        System.out.println("Digite o " + (i+1) + "ºnúmero:");
        number[i] = leia.nextInt();         
         }
   
     System.out.println("Os números digitados são:");
        for (int i = 0; i <30; i++) {
        System.out.print(number[i] + " ");     
         }
     System.out.println("\nA ordem inversa dos números digitados são:");
     for (int i = 0; i < 30; i++) {
             System.out.print(number[29-i] + " ");
         }
     leia.close();
}
}
