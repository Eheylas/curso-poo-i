/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

/**
 *
 * @author 1714290024
 */
public class NumeroParImpar {

    public static void main(String[] args) {

        int numero = 10;
        float resto = numero % 2;

        if (resto == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }
    }
}
