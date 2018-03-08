/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Yves Bodê
 */
public class TestaCaixaMensagemCostomizada {
    public static void main(String[] args) {
        Object[] opcoes = {"Java", ".Net", "PHP"};
        int opcao;
        JOptionPane.showOptionDialog(null, "Qual linguagem você prefere trabalhar?", "Enquete", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
             
    }
    
}
