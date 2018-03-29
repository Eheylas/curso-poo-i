/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author 1714290024
 */
public class OuvinteWindowListener implements WindowListener{
    

        @Override
        public void windowOpened(WindowEvent we) {
            System.out.println("Janela aberta");
        }

        @Override
        public void windowClosing(WindowEvent we) {
            System.out.println("Fechando janela ");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent we) {
            System.out.println("Janela fechada");
        }

        @Override
        public void windowIconified(WindowEvent we) {
            System.out.println("Janela minimizada");
        }

        @Override
        public void windowDeiconified(WindowEvent we) {
            System.out.println("Janela restaurada");
        }

        @Override
        public void windowActivated(WindowEvent we) {
            System.out.println("Janela ativa");
        }

        @Override
        public void windowDeactivated(WindowEvent we) {
            System.out.println("Janela inativa");
        }
        
    }
