
package atividade01;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        System.out.println("Entre com um ano.");
        int ano = entrada.nextInt();
        
        if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0){
            System.out.println("Ano é bixesto.");
        }
        else{
            System.out.println("Ano não é bixesto.");
        }
    }
}
