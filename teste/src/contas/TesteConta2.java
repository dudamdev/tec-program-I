/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author dudaa
 */
public class TesteConta2 {
    public static void main(String[] args) {
        // cria dois objetos Conta2
        Conta2 minhaConta1 = new Conta2("Eduarda");
        Conta2 minhaConta2 = new Conta2("Matos");
        
        // exibe o valor inicial de "name" para cada Conta2
        System.out.printf("Os nomes dos objeots são: %s %s%n", minhaConta1.getName(), minhaConta2.getName());
        
    }
}
