/*
7. Escreva um programa que imprima os 10 primeiros números da série de Fibonacci.
a) Crie uma classe chamada SerieFibonacci com um bloco main.
b) Dentro do main, declare as variáveis anterior, numero e proximo. 
c) Inicialize as variáveis numero e proximo com 0 e 1, respectivamente.
d) Crie um laço que se repita 10 vezes.
e) Dentro do laço, atualize a variável anterior com a variável proximo.
f) Dentro do laço, incremente a variável proximo com a variável numero.
g) Dentro do laço, atualize a variável numero com a variável anterior.
h) Dentro do laço, imprima a variável numero.
i) Execute a classe e observe o resultado.
j) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        
        int anterior;
        int proximo = 1;
        int numero = 0;
        
        for (int i = 0; i < 10; i++) {
            anterior = proximo;
            proximo += numero;
            numero = anterior;
            System.out.println(numero); 
        }
           
     }
    
}
