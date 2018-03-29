package Aula10;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
public class OuvinteFocus implements
WindowFocusListener{
 public void windowGainedFocus(WindowEvent e) {
 System.out.println("Janela ganhou o foco");
 }

 public void windowLostFocus(WindowEvent e) {
 System.out.println("Janela perdeu o foco");
 }
}