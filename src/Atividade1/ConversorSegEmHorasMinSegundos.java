/*
4. Escreva um programa que converta um número de segundos em horas, minutos e segundos.
a) Crie uma classe chamada ConversorSegundosEmHorasMinutosSegundos com um bloco main.
b) Dentro do main, declare uma variável segundos e inicialize-a com um valor.
c) Crie uma variável horas e inicialize-a com a divisão da variável segundos por 3600.
d) Atualize a variável segundos com o resto da divisão de segundos por 3600.
e) Crie uma variável minutos e inicialize-a com a divisão da variável segundos por 60.
f) Atualize a variável segundos com o resto da divisão de segundos por 60.
g) Imprima as variáveis horas, minutos e segundos no formato HH:MM:SS (Dica: concatene as variáveis com ":" utilizando o operador +).
h) Execute a classe e observe o resultado.
i) Adicione os arquivos no git remoto.
 */
package Atividade1;

/**
 *
 * @author Leandro
 */
public class ConversorSegEmHorasMinSegundos {
    public static void main(String[] args) {
        int segundos = 352;
        int horas = (segundos/3600);
        
        segundos = (segundos % 3600);
        
        int minutos = (segundos/60);
        
        segundos = (segundos % 60);
        
        System.out.println("Resultado=" + (horas +":"+minutos+":"+segundos));
        
        
        
    }
    
}
