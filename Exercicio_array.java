
package exerciciosemcasa;

import java.util.Scanner;

public class Exercicio_array {
    
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    float notas[] = new float[5];
    float soma_nota=0,nota_media;
    int cont =0;
    for(int i =0 ;i <5 ; i++){
        System.out.println("Digite a sua nota:");
        notas[i] = leia.nextFloat();
        soma_nota += notas[i];
    }
    nota_media = soma_nota/5;
    for(int i =0 ;i <5 ; i++){
        if(notas[i]>nota_media){
            cont++;
        }
    }
    System.out.println("As notas informadas são:");
    for(int i =0 ;i <5 ; i++){
        System.out.println(notas[i] + " ");
    }
    leia.close();
    System.out.println("A nota média é :" + nota_media);
    System.out.println(cont + " alunos tem nota acima da média");
}
}
