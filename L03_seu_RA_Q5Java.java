
package Exercicios_avaliativos;

import java.util.Scanner;

public class L03_seu_RA_Q5Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int ano_nas,ano_empresa,idade,ano_atual,tempo_experiencia;
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe o ano de seu nascimento:");
        ano_nas = leia.nextInt();
        System.out.println("Me informe o ano atual:");
        ano_atual= leia.nextInt();
        System.out.println("Informe o ano em que você entrou na empresa:");
        ano_empresa = leia.nextInt();
        idade = ano_atual - ano_nas;
        tempo_experiencia = ano_atual - ano_empresa;
        if(idade>=25 & tempo_experiencia==5 || idade>=35 & tempo_experiencia>=2){
        System.out.println("Tripulante:" + nome + "\nCom idade:" + idade + "anos" + "\nTempo de trabalho:"
         + tempo_experiencia + "anos" + "\nEste tripulante está apto para a viagem no espaço");                                                          
        System.out.println("Parabéns meu amigo,se prepare!");
        }
        else {
            System.out.println("Tripulante está inapto");
        }
        leia.close();
    }   
}
