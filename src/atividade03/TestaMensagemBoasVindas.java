
package atividade03;

import javax.swing.JOptionPane;

public class TestaMensagemBoasVindas {
    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?",
        "Confirmação",JOptionPane.YES_NO_OPTION);
        
        if(opcao == JOptionPane.YES_OPTION){
            String nome = JOptionPane.showInputDialog(null,"Infrome seu nome:");
            JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
            if(nome.equals("")){
                JOptionPane.showMessageDialog(null, "Nome não informado!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "O programa foi encerrado.","Alerta",
            JOptionPane.WARNING_MESSAGE);
        }   
    }
}
