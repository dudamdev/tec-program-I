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

public class Comparison {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in);
        int numOne, numTwo, sum;
        
        System.out.print("Digite o 1° número: ");
        numOne = input.nextInt();
        System.out.print("Digite o 2° número: ");
        numTwo = input.nextInt();

        if (numOne == numTwo) {
            System.out.printf("%d é igual a %d%n", numOne, numTwo);
        } 
        if (numOne != numTwo) {
            System.out.printf("%d é diferente de %d%n", numOne, numTwo);
        }
        if (numOne < numTwo) {
            System.out.printf("%d é menor que %d%n", numOne, numTwo);
        }
        if (numOne > numTwo) {
            System.out.printf("%d é maior que %d%n", numOne, numTwo);
        }
        if (numOne <= numTwo) {
            System.out.printf("%d é menor ou igual a %d%n", numOne, numTwo);
        }
        if (numOne >= numTwo) {
            System.out.printf("%d é maior ou igual a %d%n", numOne, numTwo);
        }
    }
}
