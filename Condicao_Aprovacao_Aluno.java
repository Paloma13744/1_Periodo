
package contador1;
import java.util.Scanner;
public class Condicao_Aprovacao_Aluno {

    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in); 
            String nome;
            int nota;
                System.out.println("Digite seu nome:");
                nome = leitura.nextLine();
                System.out.println("Digite a sua nota:");        
                nota = leitura.nextInt();
                leitura.close();
            if(nota>=60){
                System.out.println("Aluno aprovado");
            }
            else if(nota>=40){
                System.out.println("Aluno em recuperação");
            }
            else{
                System.out.println("Aluno reprovado");
            }
}
   }
    

