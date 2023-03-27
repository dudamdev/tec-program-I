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
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
           System.out.printf("%d x %d = %d%n", num, i, num*i);
        }

    }
}
