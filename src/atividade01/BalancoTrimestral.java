
package atividade01;

import javax.swing.JOptionPane;

/**
 *
 * @author 1714290040
 */
public class BalancoTrimestral {
    public static void main(String[] args) {
      double gastosJaneiro=15040.00, gastosFevereiro= 23004.70, gastosMarco=17010.04;  
      double gastosPrimeiroTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
        System.out.println("O gasto trimestral é R$"+gastosPrimeiroTrimestre);
        JOptionPane.showMessageDialog(null, "O gasto trimestral é R$"+gastosPrimeiroTrimestre);
        
    }
    
}
