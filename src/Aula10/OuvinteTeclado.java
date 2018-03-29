package Aula10;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class OuvinteTeclado implements KeyListener {
 public void keyPressed(KeyEvent e) {
 System.out.println("Pressionando a tecla " + e.getKeyChar());
 }
 public void keyReleased(KeyEvent e) {
 System.out.println("Liberando a tecla " + e.getKeyChar());
 }
 public void keyTyped(KeyEvent e) {
 System.out.println("Digitando a tecla " + e.getKeyChar());
 }
}