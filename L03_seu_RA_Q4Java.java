
package Exercicios_avaliativos;

import java.util.Scanner;

public class L03_seu_RA_Q4Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont=1;
        float ava1,ava2,media_ava=0;
        float frequencia=0;
        
        while(cont<=10){
            System.out.println("Informe a nota da primeira avaliação do "+ cont + "ºaluno(a):" );
            ava1 = leia.nextFloat();
            while(ava1<0){
                System.out.println("Nota inválida");
                System.out.println("Informe nota maior ou igual a 0");
                ava1 = leia.nextFloat();
            }
            System.out.println("Informe a nota da segunda avaliação do " + cont + "ºaluno(a):");
            ava2 = leia.nextFloat();
            while(ava2<0){
                System.out.println("Nota inválida");
                System.out.println("Informe nota maior ou igual a 0");
                ava2 = leia.nextFloat();
            }
            System.out.println("Informe a frequência em porcentagem:");
            frequencia = leia.nextFloat();
            while(frequencia<0){
                System.out.println("Frequência inválida");
                System.out.println("Informe frequência maior ou igual a 0");
                frequencia = leia.nextFloat();
            }
            media_ava = (ava1 + ava2) / 2;
            
            if(frequencia<50 || ava1<4 & ava2<4){
                System.out.println("Aluno reprovado");
            }
            else if(ava1<4 || ava2<4|| media_ava<6){
                System.out.println("Aluno em recuperação");
            }
            else{
                System.out.println("Aluno aprovado");
                System.out.println("Sua média é:" + media_ava + " pontos");
            }
            cont++;           
    }
             leia.close();
}
}
    