
package atividade01;
import java.util.Scanner;

public class EscalaQualitativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Entre com uma nota entre 1 a 5");
        int nota = entrada.nextInt();
        
        switch(nota){
            case 1: nota = 1;
                System.out.println("Ruim");
                break;
            
            case 2: nota = 2;
                System.out.println("Insuficiente");
                break;
            
            case 3: nota = 3;
                System.out.println("Suficiente");
                break;
            
            case 4: nota = 4;
                System.out.println("Bom");
                break;
                
            case 5: nota = 5;
                System.out.println("Ótimo");
                break;
                
            default:
                System.out.println("Nota Inválida");
        }
    }
}
