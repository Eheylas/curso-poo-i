/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author Yves Bodê
 */
public class TestaJOpttionPane {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null, "Entre com um valor");
        JOptionPane.showMessageDialog(null, "Valor de entrada: " + valor);
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação: " + valor, JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi: " + opcao);
        JOptionPane.showMessageDialog(null, "Atenção! O sistema estará em manutenção entre às 23hs e 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um item obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Falha na operação, contate o gestor", "Alerta", JOptionPane.ERROR_MESSAGE);
        
    }
}
