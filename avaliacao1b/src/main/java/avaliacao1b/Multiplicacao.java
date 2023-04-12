/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1b;
import java.util.Scanner;

/**
 *
 * @author dudaa
 */
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, resultado;
        
        System.out.print("Digite o primeiro número: ");
        a = input.nextInt();
        System.out.print("Digite o segundo número: ");
        b = input.nextInt();
        
        resultado = a * b;
        
        System.out.printf("O resultado da multiplicação é: %d%n", resultado);        
    }
}
