/*
1. Escreva um programa Java que implemente algumas caixas de mensagem.
a) Crie um pacote chamado atividade03 no projeto curso-poo-i do NetBeans.
b) Crie uma classe chamada TestaJOptionPane com um bloco main.
c) Crie uma caixa de mensagem para solicitar um valor ao usuário atribuindo o resultado na variável valor (Dica: chame o método JOptionPane.showInputDialog(null, "Informe um valor");).
d) Exiba o conteúdo da variável valor em uma caixa de mensagem (Dica: chame o método JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);).
e) Crie uma caixa de mensagem para solicitar uma confirmação ao usuário atribuindo a reposta na variável opcao (Dica: chame o método JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);).
f) Exiba o conteúdo da variável opcao em uma caixa de mensagem (Dica: chame o método JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);).
g) Crie uma caixa de mensagem para informar o usuário sobre uma manutenção no sistema (Dica: chame o método JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);).
h) Crie uma caixa de mensagem para alertar o usuário que faltou preencher um campo (Dica: chame o método JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);).
i) Crie uma caixa de mensagem para comunicar uma falha na operação do sistema (Dica: chamar o método JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);).
j) Execute a classe TestaJOptionPane e observe o resultado.
k) Adicione os arquivos no git remoto
 */
package Atividade3;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class TestaJOptionPane {
    public static void main(String[] args){
    String valor = JOptionPane.showInputDialog(null, "Informe um valor");
    JOptionPane.showMessageDialog(null,"O valor informado foi " + valor);
    int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",JOptionPane.YES_NO_OPTION);
    JOptionPane.showMessageDialog(null,"A opção escolhida foi " + opcao);
    JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    
    
    
}
