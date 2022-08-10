
package Exercicios_avaliativos;

import java.util.Scanner;

public class L03_seu_RA_Q1Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num,num_maior=0,quant=1;
        float altura,altura_maior=0;
        while(quant<=5){
            System.out.println("Informe seu número:");
            num = leia.nextInt();
            System.out.println("Informe sua altura em centímetros:");
            altura = leia.nextFloat();
            while(altura<0){
                System.out.println("Altura inválida");
                System.out.println("Informe altura maior ou igual a 0");
                altura = leia.nextFloat();
                System.out.println("Muito bem! Vamos prosseguir");
            }
            if(altura>altura_maior){
                altura_maior = altura;
                num_maior = num;
            }
            quant++;
        }
        System.out.println("Número do atleta com maior altura:" + num_maior);
        System.out.println("Maior altura:" + altura_maior);
        leia.close();
    }  
}
