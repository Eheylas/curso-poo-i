/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import javax.swing.JOptionPane;

/**
 *
 * @author FAS
 */
public class TestaJOptionPane {

    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null, "informe o valor: ");
        JOptionPane.showInputDialog(null, "valor informado foi: " + valor);
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar? ", "confirmação", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
 

    JOptionPane.showMessageDialog (

    null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog (

    null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog (

null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);

    }
}
