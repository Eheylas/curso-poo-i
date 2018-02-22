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
public class conversorHorario {
    public static void main(String[] args) {
        double segundos = 3600;
        double horas = segundos / 3600;
      segundos = (segundos % 3600)/3600;
        double minutos = (segundos / 60);
      segundos = (segundos%60);
        System.out.println("horas: "+horas+"Minutos"+minutos+"segundos"+segundos);
        
        
        
    }
}
