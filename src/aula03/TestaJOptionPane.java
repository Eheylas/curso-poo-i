/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import javax.swing.JOptionPane;

/**
 *
 * @author Yves Bodê
 */
public class TestaJOptionPane {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null, "Informe um valor");
        JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
        
    }
}
