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
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = input.nextInt();

        int n1 = 0, n2 = 1, n3;

        System.out.print("Sequência de Fibonacci até " + num + ": ");
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        input.close();
    }
}
