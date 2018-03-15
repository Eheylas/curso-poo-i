/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1614290088
 */
public class GGridLayout {
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        GridLayout leiaute = new GridLayout();
        leiaute.setColumns(3);
        leiaute.setRows(2);
        
        JPanel conteiner = new JPanel();
        conteiner.setLayout(leiaute);
        
        conteiner.add(painel1);
        conteiner.add(painel2);
        conteiner.add(painel3);
        conteiner.add(painel4);
        conteiner.add(painel5);
        
        JFrame janela = new JFrame();
        janela.add(conteiner);
        janela.setSize(640,480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}