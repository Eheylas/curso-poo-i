/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import java.util.Scanner;

/**
 *
 * @author 1714290026
 */
public class EscalaQualitativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com uma nota entre 1 e 5:");
        int nota = entrada.nextInt();
        
        switch (nota) {
            case 1: System.out.println("Ruim"); break;
            case 2: System.out.println("Insuficiente"); break;
            case 3: System.out.println("Suficiente"); break;
            case 4: System.out.println("Bom"); break;
            case 5: System.out.println("Ótimo"); break;
            default: System.out.println("Nota inválida"); break;
        }
    }
}
