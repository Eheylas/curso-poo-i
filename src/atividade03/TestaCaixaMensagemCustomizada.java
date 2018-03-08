package atividade03;

import javax.swing.JOptionPane;

/*
 * @author 1714290048
 */
public class TestaCaixaMensagemCustomizada {
    public static void main(String[] args) {
        Object[] opcoes = {"Java", ".Net", "Php"}; 
        int opcao = JOptionPane.showConfirmDialog(null, "Qual a linguagem de programação que você prefere trabalhar??", "Enquete", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,opcoes, opcoes[0]);
    }
   
}
