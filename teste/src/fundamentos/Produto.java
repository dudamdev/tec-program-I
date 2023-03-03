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
public class Produto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, resultado;
        
        System.out.print("Digite o 1° número: ");
        a = input.nextInt();
        System.out.print("Digite o 2° número: ");
        b = input.nextInt();
        System.out.print("Digite o 3° número: ");
        c = input.nextInt();
        
        resultado = a * b * c;
        
        System.out.printf("O produto é %d%n", resultado);
        
    }
    
}
