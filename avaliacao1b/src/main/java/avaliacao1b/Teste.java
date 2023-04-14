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
               
        System.out.println(quilometro + " quilometros correspondem a " + 
                ConversaoDeDados.kmEmMetros(quilometro) + " metros");
        System.out.println(litro + " litros correspondem a " + 
                ConversaoDeDados.litrosEmDecilitros(litro)+ " decilitros");
        System.out.println(metroCubico + " metros cúbicos correspondem a " + 
                ConversaoDeDados.metroCubicosEmPesCubicos(metroCubico) + " pés cúbicos");
        System.out.println(barril + " barris correspondem a " + 
                ConversaoDeDados.barrilEmDecalitros(barril) + " decalitros");
        System.out.println(barril + " barris correspondem a " + 
                ConversaoDeDados.barrilEmLitros(barril) + " litros");
        
        System.out.println();
        System.out.println("Strings formatadas com %f:");
        System.out.println();

//      Strings formatadas
        System.out.printf("%.2f quilometros correspondem a %.2f metros %n",
                quilometro, ConversaoDeDados.kmEmMetros(quilometro));
        System.out.printf("%.2f litros correspondem a %.2f decilitros %n", 
                litro,ConversaoDeDados.litrosEmDecilitros(litro));
        System.out.printf("%.2f metros cúbicos correspondem a %.2f metros cúbicos %n", 
                metroCubico, ConversaoDeDados.metroCubicosEmPesCubicos(metroCubico));
        System.out.printf("%.2f barris correspondem a %.2f barris %n", 
                barril, ConversaoDeDados.barrilEmDecalitros(barril));
        System.out.printf("%.2f barris correspondem a %.2f barris %n", 
                barril, ConversaoDeDados.barrilEmLitros(barril));
      
    }
}
