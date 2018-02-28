/*
10. Escreva um programa que associe um valor qualitativo a uma nota quantitativa (1=Ruim, 2=Insuficiente, 3=Suficiente, 4=Bom, 5=Ótimo).
a) Crie uma classe chamada EscalaQualitativa com um bloco main.
b) Acrescente a linha import java.util.Scanner; antes da declaração da classe.
c) Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
d) Imprima a mensagem "Entre com uma nota entre 1 a 5".
e) Declare a variável nota e inicialize-a com o resultado da chamada entrada.nextInt().
f) Caso a nota seja igual a 1 imprima Ruim. Caso a nota seja igual a 2 imprima Insuficiente. Caso a nota seja igual a 3 imprima Suficiente. Caso a nota seja igual a 4 imprima Bom. Caso a nota seja 5 imprima Ótimo. Caso contrário imprima Nota inválida (Dica: utilize a sintaxe switch(nota) { case: 1; case2; ... })
g) Execute a classe e observe o resultado.
h) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class EscalaQuantitativa {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIgite a nota entre 1 e 5: ");
        int nota = entrada.nextInt();
        if (nota == 1) {
            System.out.println("Nota ruim");
        } else if (nota == 2) {
            System.out.println("Nota insuficiente");
        } else if (nota == 3) {
            System.out.println("Nota suficiente");
        } else if (nota == 4) {
            System.out.println("Nota boa");
        } else if (nota == 5) {
            System.out.println("Nota ótima");
        }
        
    } 
}
