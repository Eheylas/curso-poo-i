/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author 1714290032
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        double anterior;
        double numero = 0;
        double proximo = 1;
            for (int i = 0; i < 10; i++) {
            anterior = proximo;
            proximo = proximo+numero;
            numero = anterior;
                System.out.println(numero);
        }
        
    }
}
