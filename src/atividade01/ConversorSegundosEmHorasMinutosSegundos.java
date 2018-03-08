package atividade01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves Bodê
 */
public class ConversorSegundosEmHorasMinutosSegundos {
    public static void main(String[] args) {
        int segundos = 61;
        int horas = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
    }
}
