
package exerciciosemcasa;
//1. Elabore um algoritmo para solicitar ao usuário um número e informar se este é par ou impar.

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     int num ;
        System.out.println("Informe um número:");
        num = leia.nextInt();
        if(num % 2 ==0){
            System.out.println("Número Par");
        }
        else{
            System.out.println("Número Ímpar");
        }
}
}
