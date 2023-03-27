/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author 1091392223010
 */

public class ExTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, cont;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        int[] vetorPrimo = new int[num];
        int indice = 0;
        for (int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                vetorPrimo[indice] = i;
                indice++;
            }
        }
        System.out.println("Números primos menores ou iguais a " + num + ": " + Arrays.toString(Arrays.copyOf(vetorPrimo, indice)));
    }
}

