/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author 1714290044
 */
public class TestaJOptionPane 
{
    public static void main(String[] args) 
    {
    String valor =JOptionPane.showInputDialog(null,"informe um valor");
    JOptionPane.showMessageDialog(null, "o valor informado foi" + valor);
    int opcao = JOptionPane.showConfirmDialog(null,"deseja continuar?","Confirmação",JOptionPane.YES_NO_OPTION);
    JOptionPane.showMessageDialog(null,"opção escolhida foi " + opcao);
    JOptionPane.showMessageDialog(null,"o sistema estará em manutenção das 23hs a 04hs","Aviso",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"atenção! Faltou preencher um campo obrigatório.","alerta",JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null,"falha na operação! Contate o gestor.","erro",JOptionPane.ERROR_MESSAGE);
    
    }
}
