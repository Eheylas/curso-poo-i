
package atividade03;

import javax.swing.JOptionPane;

public class TestaCaixaMensagemCustomizada {
    public static void main(String[] args) {
        Object[] opcoes = {"Java",".Net","Php"};
        
        int opcao = JOptionPane.showOptionDialog(null, 
            "Qual a linguagem de programação que você prefere trabalhar?", 
            "Enquete", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
            null, opcoes, opcoes[0]);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
    }
}
