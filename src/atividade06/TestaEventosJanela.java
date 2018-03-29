/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author 1714290001
 */
public class TestaEventosJanela {
    public static void main(String[] args) {
       Janela janela = new Janela();
       janela.addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent we) {
               System.out.println("Dica do dia");
           }

           @Override
           public void windowClosing(WindowEvent we) {
                System.out.println("Quer sair da aplicação?");
           }

           @Override
           public void windowClosed(WindowEvent we) {
              
           }

           @Override
           public void windowIconified(WindowEvent we) {
           }

           @Override
           public void windowDeiconified(WindowEvent we) {
           }

           @Override
           public void windowActivated(WindowEvent we) {
           }

           @Override
           public void windowDeactivated(WindowEvent we) {
           }
           });
    }
     
        
    
}


