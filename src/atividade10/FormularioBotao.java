/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author 1714290044
 */
public class FormularioBotao extends JFrame{
    private JButton botaoSalvar;
    private JButton botaoFechar;
    private JCheckBox checkCursoAds;
    private JCheckBox checkCursoSegInf;
    private JCheckBox checkCursoJogos;
    private JCheckBox checkCursoRedes;
    private JRadioButton radioBolsaIntegral100;
    private JRadioButton radioBolsaIntegral75;
    private JRadioButton radioBolsaIntegral50;
    private JRadioButton radioBolsaIntegral25;
    private JRadioButton radioSemBolsa;
    private JLabel rotuloCurso;
    private JLabel rotuloBolsa;
    private JPanel painelBotoes;
    private JPanel painelCentral;
    private int quantidadeCursos= 0;        
    
    public FormularioBotao()
    {
    
    
    botaoSalvar = new JButton("Salvar");
    botaoFechar = new JButton("Fechar");
    
    checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
    checkCursoSegInf = new JCheckBox("Segurança da Informação");
    checkCursoJogos  = new JCheckBox("Jogos Digitais");
    checkCursoRedes  = new JCheckBox("Redes de Computadores");
    
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JCheckBox checkBox = (JCheckBox)e.getSource();
               if(checkBox.isSelected()== true)
               {
                   quantidadeCursos++;
               if(quantidadeCursos>2)
               {
                   checkBox.setSelected(false);
                   JOptionPane.showMessageDialog(null,"Atenção! Só é permitido a escolhe de até 2 cursos");
               }
               }
               else
               {
                   quantidadeCursos--;
               }
            }
        };
    
    radioBolsaIntegral100 = new JRadioButton("Integral 100%");
    radioBolsaIntegral75 = new JRadioButton("Parcial 75%");
    radioBolsaIntegral50 = new JRadioButton("Parcial 50%");
    radioBolsaIntegral25 = new JRadioButton("Parcial 25%");
    radioSemBolsa = new JRadioButton("Sem Bolsa");
    
    rotuloCurso = new JLabel("Selecione até duas opções de curso:");
    rotuloBolsa = new JLabel("Deseja cursar com bolsa de estudo?");
    GridLayout leiout = new GridLayout(11,1);
    painelBotoes = new JPanel();
    painelCentral  = new JPanel(leiout);
   
    painelBotoes.add(botaoSalvar);
    painelBotoes.add(botaoFechar);
    
    painelCentral.add(rotuloCurso);
    painelCentral.add(checkCursoAds);
    painelCentral.add(checkCursoSegInf);
    painelCentral.add(checkCursoJogos);
    painelCentral.add(checkCursoRedes);
    
        checkCursoAds.addActionListener(ouvinte);
        checkCursoSegInf.addActionListener(ouvinte);
        checkCursoJogos.addActionListener(ouvinte);
        checkCursoRedes.addActionListener(ouvinte);
    
    painelCentral.add(rotuloBolsa);
    painelCentral.add(radioBolsaIntegral100);
    painelCentral.add(radioBolsaIntegral75);
    painelCentral.add(radioBolsaIntegral50);
    painelCentral.add(radioBolsaIntegral25);
    painelCentral.add(radioSemBolsa);
    
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBolsaIntegral100);
        grupo.add(radioBolsaIntegral75);
        grupo.add(radioBolsaIntegral50);
        grupo.add(radioBolsaIntegral25);
        grupo.add(radioSemBolsa);
        radioSemBolsa.setSelected(true);
    
    this.add(painelBotoes, BorderLayout.SOUTH);
    this.add(painelCentral, BorderLayout.CENTER);
    
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
            
}
