/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import javax.swing.JOptionPane;


/**
 *
 * @author dudaa
 */
public class NomeDialogo {
    public static void main(String[] args) {
        // pede para o usuário inserir o nome
        String name = JOptionPane.showInputDialog("Qual é o seu nome?");
        
        // cria a mensagem
        String message = String.format("Olá %s, bem vindo(a) ao Java!", name);        
        JOptionPane.showMessageDialog(null, message, "Mensagem", 1);
        
        // exibe a mensagem passando a variável "name" diretamente 
        JOptionPane.showMessageDialog(null, "Olá " + name + ", bem vindo(a) ao Java, passando a variável \"name\" aqui!");    
    }
}
