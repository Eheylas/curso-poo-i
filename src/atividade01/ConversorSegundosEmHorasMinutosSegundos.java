package atividade01;
/*
 * @author 1714290048
 */
public class ConversorSegundosEmHorasMinutosSegundos {
    public static void main(String[] args) {
        int segundos =10921, horas = segundos/3600,minutos;
        segundos = segundos % 3600;
        minutos = segundos /60;
        segundos = segundos % 60;
        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
