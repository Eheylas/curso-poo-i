package atividade01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1714290010
 */
public class SequenciaFibonacci {
    public static void main(String[] args) {
        int anterior, numero, proximo;
        numero = 0;
        proximo = 1;
        for (int  i = 0; i < 10; i++) {
            anterior = proximo;
            proximo += numero;
            numero = anterior;
            System.out.println(numero);
        }
        
    }
    
}
