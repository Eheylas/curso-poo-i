/*
6. Escreva um programa que imprima todos os múltiplos de 3, entre 1 e 100.
a) Crie uma classe chamada MultiplosDeTres com um bloco main.
b) Dentro do main, declare um laço que se repita de 1 a 100 (Dica: digite for e pressione as teclas CTRL ESPAÇO para listar as formas de laço).
c) Dentro do laço, se o resto da divisão da variável i (contador) por 3 é igual a zero então imprima o valor de i.
d) Execute a classe e observe o resultado.
e) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
public class MultiplosDeTres {
    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {
            if ((i % 3)==0){
                System.out.println(i);
            }
            
        }
        
    }
    
}
