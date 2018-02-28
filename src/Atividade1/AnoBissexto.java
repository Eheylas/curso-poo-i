/*
9. Escreva um programa que leia um ano e verifique se ele é bissexto.
a) Crie uma classe chamada AnoBissexto com um bloco main.
b) Acrescente a linha import java.util.Scanner; antes da declaração da classe.
c) Dentro do main, declare a variável entrada do tipo Scanner e inicialize-a com uma instância desse tipo.
d) Imprima a mensagem "Entre com um ano".
e) Declare a variável ano e inicialize-a com o resultado da chamada entrada.nextInt().
f) Se ano é múltiplo de 4 e não é múltiplo de 100, ou é múltiplo de 400 então imprima Ano é bissexto. Senão imprima Ano não é bissexto. (Dica: um número é múltiplo de outro se o resto da divisão é igual a zero).
g) Execute a classe e observe o resultado.
h) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um ano: ");
        int ano = entrada.nextInt();
        if (ano % 400 == 0) {
            System.out.println("Ano é bissexto");
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }
    }
    
}
