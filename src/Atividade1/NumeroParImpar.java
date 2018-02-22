/*
* 3. Escreva um programa que determine se um número é par ou ímpar.
* a) Crie uma classe chamada NumeroParImpar com um bloco main.
* b) Dentro do main, declare a variável numero e inicialize-a com um valor.
* c) Crie uma variável resto e inicialize-a com o resto da divisão da variável numero por 2 (Dica: operador % calcula o resta da divisão).
* d) Se a variável resto é igual a 0 então imprima "Número é par", senão imprima "Número é ímpar".
* e) Execute a classe e observe o resultado.
* f) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
public class NumeroParImpar {
    public static void main(String[] args) {
        int numero = 3;
        int resto = (numero % 2);
        
        if (resto == 0){
        System.out.println("Número é par1");
        }else{
            System.out.println("Número é impar");
            
        }
        
    }
    
}
