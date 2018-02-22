
package atividade01;
import java.util.Scanner;
        
public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro para X");
        int numeroX = entrada.nextInt(); 
        System.out.println("Entre com um valor inteiro para Y");
        int numeroY = entrada.nextInt();
        
        if(numeroX < numeroY){
            System.out.println("Menor:"+numeroX);
        }
        else{
            System.out.println("Menor:"+numeroY);
        }
        
    }
}
