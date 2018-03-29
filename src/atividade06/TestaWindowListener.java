/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

/**
 *
 * @author 1614290088
 */

    import javax.swing.JFrame;
public class TestaWindowListener {
 public static void main(String[] args) {
 OuvinteJanela ouvinte = new OuvinteJanela();
 OuvinteState ouvinteState = new OuvinteState ();
 JFrame janela = new JFrame();
// janela.addWindowListener(ouvinte);
//janela.addWindowStateListener( ouvinteState );

 janela.setSize(300, 200);
 janela.setDefaultCloseOperation(
 JFrame.DO_NOTHING_ON_CLOSE
 );
 janela.setVisible(true);
 }
}

