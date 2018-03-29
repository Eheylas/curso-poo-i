package Aula10;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class OuvinteJanela implements WindowListener{
 public void windowActivated(WindowEvent e) {
 System.out.println("Janela ativa");
 }

 public void windowClosed(WindowEvent e) {
 System.out.println("Janela fechada");
 }

 public void windowClosing(WindowEvent e) {
 System.out.println("Fechando a janela");
 }

 public void windowDeactivated(WindowEvent e) {
 System.out.println("Janela inativa");
 }

 public void windowDeiconified(WindowEvent e) {
 System.out.println("Janela restaurada");
 }

 public void windowIconified(WindowEvent e) {
 System.out.println("Janela minimizada");
 }

 public void windowOpened(WindowEvent e) {
 System.out.println("Janela aberta");
 }
}

