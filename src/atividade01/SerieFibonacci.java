
package atividade01;

public class SerieFibonacci {
    public static void main(String[] args) {
        int anterior, numero = 0, proximo = 1;
        
        for (int i = 0; i < 10; i++) {
            anterior = proximo;
            proximo += numero;
            numero = anterior;
            
            System.out.println(numero);
        }
    }
}
