/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;
import java.util.Scanner;

/**
 *
 * @author 1091392223010
 */
public class Temperatura {
    public static void main(String[] args) {
        final int parOne = 32;
        final double parTwo = 5/9.0;
        double C;
        double F;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        F = input.nextDouble();
        
        C = (F - parOne) * parTwo;
        
        System.out.printf("A temperatura em Célsius é %f°%n", C);
        
    }   
}
