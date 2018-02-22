/*
8. Escreva um programa que leia dois números inteiros e determine qual é o menor.
a) Crie uma classe chamada MenorNumero com um bloco main.
b) Acrescente a linha import java.util.Scanner; antes da declaração da classe.
c) Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo (Dica: utilize new Scanner(System.in) para criar a instância).
d) Imprima a mensagem "Entre com um valor inteiro para X".
e) Declare a variável numeroX e inicialize-a com o resultado da chamada entrada.nextInt().
f) Imprima a mensagem "Entre com um valor inteiro para Y".
g) Declare a variável numeroY e inicialize-a com o resultado da chamada entrada.nextInt().
h) Se numeroX é menor que numeroY então imprima a variável numeroX, senão imprima a variável numeroY.
i) Execute a classe e observe o resultado.
j) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class MenorNumero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
                System.out.println("Entre com um valor inteiro para X.");
                int numeroX = entrada.nextInt();
                System.out.println("Entre com um valor inteiro para Y.");
                int numeroY = entrada.nextInt();
                
                if (numeroX < numeroY){
                    System.out.println("O menor numero é: "+numeroX);
                }else{
                    System.out.println("O menor numero é: "+numeroY);
                }
             
    }
    
}
