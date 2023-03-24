/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

/**
 *
 * @author 1091392223010
 */
public class ExTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, cont;
        boolean primo;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        for(int i = 2; i < num; i++) {
            if (num != 1 && num != 2) {
                for (int j = 1; j < num; j++) {
                    
                }
                if (num % i == 0) {
                    primo = false;
                }
                if (num % i != 0) {
                    primo = true;
                }
            }else {
                primo = true;
            }
            
            if (primo) {
                System.out.println("O número é primo");
            }else {
                System.out.println("O número não é primo");
1, 2, 3, 5
            }
        }
        
    }
}
