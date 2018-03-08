/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author 1714290026
 */
public class TestaMensagemBoasVindas {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?",
                "Início", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            String nome = JOptionPane.showInputDialog(null, "Informe seu nome");
            if (!nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Bem-vindo " + nome,
                        "Bem-vindo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nome não informado!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "O programa foi encerrado.",
                "Fim", JOptionPane.WARNING_MESSAGE);
    }
}
