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
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com um ano: ");
        int ano = entrada.nextInt();
        
        if( ((ano%4 == 0) && (ano%100 != 0)) || (ano%400 == 0) ) {
            System.out.println("Ano é bissexto!");
        }
        else {
            System.out.println("Ano não é bissexto!");
        }
    }
}