
package Exercicios_avaliativos;

import java.util.Scanner;


public class L03_seu_RA_Q2Java {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont = 1,cont2 =0;
        float salb,valor_prestacao,valor_prestacao30;
        System.out.println("Para finalizar o programa,informe o salário com valor negativo:");
        System.out.println("Informe seu salário:");
        salb = leia.nextFloat();
        while(salb>=0){ 
            System.out.println("Informe o valor da prestação:");
            valor_prestacao = leia.nextFloat();
            valor_prestacao30 = salb * 30/100;
            if(valor_prestacao>valor_prestacao30){
                System.out.println("Empréstimo não-concedido");
                System.out.println("O valor máximo permitido para seu empréstimo é menor que:"+
                + valor_prestacao);
                valor_prestacao = leia.nextFloat();
            }
            
            else{
                System.out.println("Empréstimo concedido");
            }
            System.out.println("Informe o seu salário bruto");
            salb = leia.nextFloat();
            cont++;        
    } 
          leia.close();
}
}
            
