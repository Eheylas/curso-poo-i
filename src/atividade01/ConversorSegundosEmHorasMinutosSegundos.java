
package atividade01;

public class ConversorSegundosEmHorasMinutosSegundos {
    public static void main(String[] args) {
        int segundos = 3600;
        int horas = segundos/3600;
        
        segundos = horas % segundos;
        
        int minutos = segundos/60;
        
        segundos = segundos % 60;
        
        System.out.println("Relógio = "+horas+":"+minutos+":"+segundos);
                
    }
}
