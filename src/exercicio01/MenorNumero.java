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
import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner entrada = new Scanner(System.in);
        {
            System.out.printf("Informe um número para comparação: ");
            num1 = entrada.nextInt();

            System.out.printf("Informe um número para a comparação: ");
            num2 = entrada.nextInt();
        }

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é o maior");
        } else if (num1 == num2) {
            System.out.println("São iguais!!!!");
        } else {
            System.out.println("O número " + num2 + " é o maior");
        }
    }
}
