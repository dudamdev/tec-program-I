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

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, res = 1;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            res *= i;
        }

        System.out.print(num + "! = " + res);
    }
}

