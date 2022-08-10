
package l04_array_0056518_qx.java;

import java.util.Scanner;

public class L04_Array_0056518_Q1 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int vetor_1[] = new int[10];
    int vetor_2[] = new int[10],num;
    for (int i = 0; i < 10; i++) {
    System.out.println("Digite o " +(i+1) + "ºnúmero:");
    vetor_1[i]= leia.nextInt();
    }
    for (int i = 0; i < 10; i++) {
        vetor_2[i]= vetor_1[i] * 2;
    }
    System.out.println("Os números do primeiro vetor são:");
    for (int i = 0; i < 10; i++) {
    System.out.print(vetor_1[i] + " ");
    }
    System.out.println("Os números do segundo vetor são:");
    for (int i = 0; i < 10; i++) {
        System.out.print(vetor_2[i] + " ");
    }
    leia.close();
    }
}

