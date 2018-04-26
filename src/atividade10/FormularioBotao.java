/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class FormularioBotao {

    private static LayoutManager leiauteradio;
    
    public static void main(String[] args) {
    
    JButton botaoSalvar = new JButton("Salvar");
 JButton botaoFechar = new JButton("Fechar");
 JPanel painel = new JPanel();
 painel.add(botaoSalvar);
 painel.add(botaoFechar);
 
 JLabel curso = new JLabel("Selecione até duas opções de curso");
 JLabel bolsa = new JLabel("Deseja cursar com bolsa de estudo?");

 JCheckBox checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
 JCheckBox checkCursoSegInf = new JCheckBox("Segurança da Informação");
 JCheckBox checkCursoJogos = new JCheckBox("Jogos Digitais");
  JCheckBox checkCursoRedes = new JCheckBox("Redes de Computadores");
  
  JRadioButton radioBolsaIntegral100 = new JRadioButton ("Integral 100%");
JRadioButton radioBolsaParcial75   = new JRadioButton ("Integral 75%");
JRadioButton radioBolsaParcial50   = new JRadioButton ("Integral 50%");
JRadioButton radioBolsaParcial25   = new JRadioButton ("Integral 25%");
JRadioButton radioSemBolsa         = new JRadioButton ("Sem Bolsa%");
GridLayout leiaute = new GridLayout(10, 5);

 JPanel painelleiaute = new JPanel();
 
 painelleiaute.add(checkCursoAds);
 painelleiaute.add(checkCursoSegInf);
 painelleiaute.add(checkCursoJogos);
 painelleiaute.add(checkCursoRedes); 
painelleiaute.setLayout(leiauteradio);
painelleiaute.add(radioBolsaIntegral100);
painelleiaute.add(radioBolsaParcial75);
painelleiaute.add(radioBolsaParcial50);
painelleiaute.add(radioBolsaParcial25);
painelleiaute.add(radioSemBolsa);
 
ButtonGroup grupo = new ButtonGroup();
 grupo.add(radioBolsaIntegral100);
 grupo.add(radioBolsaParcial75);
 grupo.add(radioBolsaParcial50);
 grupo.add(radioBolsaParcial25);
 grupo.add(radioSemBolsa);
 



 
 


 JFrame janela = new JFrame();
 
 janela.add(painelleiaute, BorderLayout.CENTER);
 janela.add(painel, BorderLayout.SOUTH);
 janela.add(painelleiaute,BorderLayout.NORTH);
 janela.setSize(700, 500);
 janela.setDefaultCloseOperation(
 JFrame.EXIT_ON_CLOSE);
 janela.setVisible(true);
 }

   
}
