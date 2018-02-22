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
public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com um valor inteiro para X: ");
        int numeroX = entrada.nextInt();
        System.out.println("Entre com um valor inteiro para Y: ");
        int numeroY = entrada.nextInt();
        
        if(numeroX < numeroY) {
            System.out.println(numeroX);
        }
        else {
            System.out.println(numeroY);
        }
    }
}
