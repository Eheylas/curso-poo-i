/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

/**
 *
 * @author 1714290024
 */
public class BalancoTrimestral {

    public static void main(String[] args) {
        double gastosJaneiro, gastosFeveiro, gastosMarco,
                gastosPrimeiroTrimestre;

        gastosJaneiro = 15040.00;
        gastosFeveiro = 23004.70;
        gastosMarco = 17010.04;

        gastosPrimeiroTrimestre = gastosJaneiro + gastosFeveiro + gastosMarco;

        System.out.println("Os gastos do primeiro trimestre foram: "
                + gastosPrimeiroTrimestre);
        
        
    }
}
