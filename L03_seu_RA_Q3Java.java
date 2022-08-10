
package Exercicios_avaliativos;

import java.util.Scanner;

public class L03_seu_RA_Q3Java {
       public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       int n1,n2,n3;
           System.out.println("Informe o primeiro número:");
           n1 = leia.nextInt();
           System.out.println("Informe o segundo número:");
           n2 = leia.nextInt();
           System.out.println("Informe o terceiro número");
           n3 = leia.nextInt();
           if(n1>n2 & n1>3 & n2>3 ){
               System.out.println("Ordem decrescente:");
               System.out.println(n1);
               System.out.println(n2);
               System.out.println(n3);
           }
           else if(n1>n2 & n1>3 & n3>n2){
               System.out.println("Ordem decrescente:");
               System.out.println(n1);
               System.out.println(n3);
               System.out.println(n2);
           }
           else if(n2>n1 & n2>n3 & n1>n3){
               System.out.println("Ordem decrescente:");
               System.out.println(n2);
               System.out.println(n1);
               System.out.println(n3);
           }
           else if (n2>n1 & n2>n3 & n3>n1){
               System.out.println("Ordem decrescente:");
               System.out.println(n2);
               System.out.println(n3);
               System.out.println(n1);
           }
           else if (n3>n1 & n3>n2 & n1>n2){
               System.out.println("Ordem decrescente:");
               System.out.println(n3);
               System.out.println(n1);
               System.out.println(n2);
           }
           else if (n3>n1 & n3>n2 & n2>n1){
               System.out.println("Ordem decrescente:");
               System.out.println(n3);
               System.out.println(n2);
               System.out.println(n1);
           }
             leia.close();
  }
}
                 