/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

/**
 *
 * @author dudaa
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.print("O número " + num + " é par");
        } else {
            System.out.print("O número " + num + " é impar");
        }
    }
}
