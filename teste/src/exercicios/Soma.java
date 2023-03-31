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
public class Soma {
    public static void main(String[] args) {
        String numOne = JOptionPane.showInputDialog("Digite o primeiro número");
        String numTwo = JOptionPane.showInputDialog("Digite o segundo número");
        
        int convertNumOne = Integer.parseInt(numOne);
        int convertNumTwo = Integer.parseInt(numTwo);
        
        JOptionPane.showMessageDialog(null, "A soma dos números é " + (convertNumOne + convertNumTwo), "Mensagem", 1);


    }
}
