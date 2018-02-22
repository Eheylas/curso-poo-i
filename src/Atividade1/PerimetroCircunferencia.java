/*
5. Escreva um programa que calcule o perímetro de uma circunferência.
a) Crie uma classe chamada PerimetroCircunferencia com um bloco main.
b) Dentro do main, declare uma constante PI com o valor 3.1416 (Dica: acrescente a cláusula final na declaração da variável).
c) Crie uma variável raio e inicialize-a com um valor.
d) Crie uma variável perimetro e inicialize-a com o resultado de 2*PI*raio.
e) Imprima a variável perimetro.
f) Execute a classe e observe o resultado.
g) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
public class PerimetroCircunferencia {
    public static void main(String[] args) {
        final double PI = 3.1416;
        
        float raio = 2;
        double perimetro = (2*PI*raio);
        
        System.out.println("Resultado:" + perimetro);
    }
    
}
