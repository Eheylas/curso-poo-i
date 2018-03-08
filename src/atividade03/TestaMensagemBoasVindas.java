/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author 1714290055
 */
public class TestaMensagemBoasVindas {
    public static void main(String[] args){
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?", "Iniciação!", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            String nome = JOptionPane.showInputDialog(null, "Informe seu nome!");
            if(!nome.equals("")){
                JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
            }
            else{
                JOptionPane.showMessageDialog(null, "Nome não informado!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        }
        
    }
}
