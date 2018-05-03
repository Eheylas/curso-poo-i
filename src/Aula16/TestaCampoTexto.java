/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula16;

 import java.awt.FlowLayout;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.JTextField;
/**
 *
 * @author 1714290001
 */
 public class TestaCampoTexto {
 public static void main(String[] args) {
 JTextField campoNome = new JTextField(30);
 JTextField campoDataNascimento = new
 JTextField(10);
 campoDataNascimento.setEditable(false);
 JPanel painel = new JPanel();
 painel.setLayout(new FlowLayout(
 FlowLayout.LEFT));
 painel.add(campoNome);
 painel.add(campoDataNascimento);
 JFrame janela = new JFrame();
 janela.add(painel);
 janela.setSize(400, 200);
 janela.setDefaultCloseOperation(
 JFrame.EXIT_ON_CLOSE);
 janela.setVisible(true);
 }
 }