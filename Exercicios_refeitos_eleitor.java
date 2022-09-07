
package exerciciosemcasa;

import java.util.Scanner;
/*
Faça um programa que leia a idade (valor inteiro) de um conjunto de pessoas. Para cada
pessoa, imprima a sua classe eleitoral:
● Não eleitor (abaixo de 16 anos);
● Eleitor obrigatório (entre 18 e 65 anos);
● Eleitor facultativo (entre 16 e acima dos 65 anos)
*/
public class Exercicios_refeitos_eleitor {
   public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       int qt ;
       System.out.println("Qual o número de pessoas vai participar da pesquisa?");
       qt = leia.nextInt();
       int idade[] = new int [qt];
       for (int i = 0; i < qt; i++) {
           System.out.println("Informe a idade da" + (i+1) + "ªpessoa:");
           idade[i] = leia.nextInt();
       }
       for (int i = 0; i < qt; i++) {
       if(idade[i]<16){
           System.out.println("Não é eleitor"+ " ");
       }
       else if(idade[i]>=18){
           System.out.println("Eleitor obrigatório" + " ");
       }
       else if(idade[i]==16 || idade[i]>65){
           System.out.println("Eleitor facultativo" + " ");
         }
       }
   }
}
