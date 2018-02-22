/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1714290010
 */
public class NumeroParImpar {
    public static void main(String[] args) {
        int numero = 3;
        int resto = numero % 2;
        if (resto == 0) {
            System.out.println("Numero é par");
        } else {
            System.out.println("Numero é ímpar");
        }
    }
}
