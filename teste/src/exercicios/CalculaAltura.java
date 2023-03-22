/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Tem-se um conjunto de dados contendo a altura e o sexo "M" masculino e "F" Feminino de 10 pessoas.
// Fazer um programa em Java que calcule e escreva:
// a) A maior e a menor altura do grupo
// b) A média de altura dos homens;
// c) A quantidade de mulheres.

package exercicios;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author 1091392223010
 */
public class CalculaAltura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner input = new Scanner(System.in);
        
        double maiorAltura = 0.0;
        double menorAltura = 3.0;
        double somaAlturasHomens = 0.0;
        double numHomens = 0.0;
        double numMulheres = 0.0;
        
        // estrutura de repetição 
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = input.nextDouble();
            
            System.out.print("Digite o sexo da pessoa " + i + ": ");
            String sexo = input.next();
            
            if(altura > maiorAltura) {
                maiorAltura = altura;
            }
            
            if(altura < menorAltura) {
                menorAltura = altura;
            }
            
            if(sexo.equals("M")) {
                somaAlturasHomens += altura;
                numHomens++;
            }else {
                numMulheres++;
            }
            
        }
        
        double mediaAlturasHomens = somaAlturasHomens / numHomens;
        
        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("A média da altura dos homens é: " + mediaAlturasHomens);
        System.out.println("O total de mulheres é " + numMulheres);   
        
    }
}
