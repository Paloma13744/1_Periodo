
package exerciciosemcasa;

import java.util.Scanner;

public class ExerciciosemCasa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor:");
        valor = teclado.nextInt();
        System.out.println("Antecessor:" + (valor -1));
        System.out.println("Sucessor:"+ (valor + 1));
       
    }
    
}
