/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1714290010
 */
import java.util.Scanner;

public class EscalaQuantitativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com uma nota entre 1 e 5");
        int nota = entrada.nextInt();
        if (nota == 1) {
            System.out.println("Nota ruim");
        } else if (nota == 2) {
            System.out.println("Nota insuficiente");
        } else if (nota == 3) {
            System.out.println("Nota suficiente");
        } else if (nota == 4) {
            System.out.println("Nota boa");
        } else if (nota == 5) {
            System.out.println("Nota ótima");
        }
        
    }
}
