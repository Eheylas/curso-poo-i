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
public class TestaCaixaMensagemCustomizada {

    public static void main(String[] args) {
        Object[] opcoes = {"Java", ".Net", "PHP"};
        int opcao;

        opcao = JOptionPane.showOptionDialog(
                null,
                "Qual a linguagem de programação que você prefere trabalhar?",
                "Enquete",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        
        JOptionPane.showMessageDialog(null, "A opcao escolhida foi: " + opcoes[opcao]);

    }
}
