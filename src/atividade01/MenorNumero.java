package atividade01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves Bodê
 */
import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o valor inteiro para X: ");
        int numeroX = entrada.nextInt();
        System.out.println("Entre com o valor inteiro para Y: ");
        int numeroY = entrada.nextInt();
        if (numeroX > numeroY) {
            System.out.println("Maior numero: " + numeroX);
        } else {
            System.out.println("Maior numero: " + numeroY);
        }
    }
    
}
