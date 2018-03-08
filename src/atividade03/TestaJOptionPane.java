package atividade03;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author 1714290040
 */
public class TestaJOptionPane {
    public static void main(String[] args) {
        String valor;
        int opcao;
        
        valor = JOptionPane.showInputDialog(null, "Informe um valor");
        System.out.println(valor);
        if(valor == null || valor.equals("")){
            if(valor == null){
                Finaliza();
            }
            else{
              while(valor == null || valor.equals("")){
              testaCampo();
              valor = JOptionPane.showInputDialog(null, "Informe um valor");
              }
            }
        }
        if(valor == null){
            System.out.println("Programa Finalizado");
        }
        else{
          JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);
        opcao=JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
        
        if(opcao!=JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", 
                  JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE); 
        }
        else{
            Finaliza();  
         }
        
        }
        
    }
    public static void testaCampo(){
        JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta",
                JOptionPane.WARNING_MESSAGE);
    }
    public static void Finaliza(){
        JOptionPane.showMessageDialog(null, "O programa será finalizado");
            
    }
    
}
