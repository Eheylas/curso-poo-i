package atividade03;

import javax.swing.JOptionPane;

/*
 * @author 1714290048
 */
public class TestaMensagemBoasVindas {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa? ", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == 0) {
            String nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
            if (nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Nome não informado!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Bem Vindo! " + nome);
            }
        }
        else{
         JOptionPane.showMessageDialog(null, "O programa foi encerrado.");
        }
    }
}
