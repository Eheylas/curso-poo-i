/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author 1714290024
 */
public class TestaMensagemBoasVindas {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o "
                + "programa?");
        String nome = "";

        if (opcao == JOptionPane.YES_OPTION) {
            nome = JOptionPane.showInputDialog(null, "Insira seu nome: ");
            if (nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Nome não informado!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Bem-vindo, "+ nome + "!", 
                        "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O programa foi encerrado.",
                    "Aviso!", JOptionPane.WARNING_MESSAGE);

        }
    }
}
