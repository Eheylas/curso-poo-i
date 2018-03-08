/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAS
 */
import java.util.Scanner;

public class EscalaQualitativa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        {
            System.out.printf("Entre com a nota enre 1 e 5: ");
            nota = entrada.nextInt();
        }
        switch (nota) {
            case 1:
                System.out.println("Nota RUIM");
                break;
            case 2:
                System.out.println("Nota INSUFICIENTE");
                break;
            case 3:
                System.out.println("Nota SUFICIENTE");
                break;
            case 4:
                System.out.println("Nota BOM");
                break;
            case 5:
                System.out.println("Nota ÓTIMO");
        }
    }
}
