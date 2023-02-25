/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import java.util.Scanner;

/**
 *
 * @author 1091392223010
 */
public class Soma {
    public static void main(String[] arg) {
     // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in); // inicializando o objeto input
        int numOne;
        int numTwo;
        int sum;
        
        System.out.print("Digite o primeiro número: ");
        numOne = input.nextInt(); // método ("importado" do Scanner) que permite a leitura do input e armazenamento na variável
        System.out.print("Digite o segundo número: ");
        numTwo = input.nextInt();
        
        sum = numOne + numTwo;
        
        System.out.printf("A Soma é %d%n", sum);
    }
}
