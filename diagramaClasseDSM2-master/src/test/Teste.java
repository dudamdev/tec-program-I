package test;

import implement.Automovel;
import implement.Motocicleta;
import implement.Veiculo;

public class Teste {
    public static void main(String[] args) {
        Automovel auto = new Automovel();
        Motocicleta moto = new Motocicleta();

        Veiculo.calcularValorVenda(moto);
        Veiculo.calcularValorVenda(auto);

        moto.ligar();
    }
}
