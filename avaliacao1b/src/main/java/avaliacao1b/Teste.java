/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao1b;

/**
 *
 * @author dudaa
 */
public class Teste { 
    public static void main(String[] args) {
        double quilometro = 2.8;
        double litro = 2.5;
        double metroCubico = 2.5;
        double barril = 3.0;
               
        System.out.println("2.8 quilometros correspondem a " + ConversaoDeDados.kmEmMetros(quilometro) + " metros");
        System.out.println("2.5 litros correspondem a " + ConversaoDeDados.litrosEmDecilitros(litro)+ " decilitros");
        System.out.println("2.5 metros cúbicos correspondem a " + ConversaoDeDados.metroCubicosEmPesCubicos(metroCubico) + " pés cúbicos");
        System.out.println("3.0 barris correspondem a " + ConversaoDeDados.barrilEmDecalitros(barril) + " decalitros");
        System.out.println("3.0 barris correspondem a " + ConversaoDeDados.barrilEmLitros(barril) + " litros");
      
    }
}
