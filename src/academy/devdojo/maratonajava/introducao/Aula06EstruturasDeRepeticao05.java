package academy.devdojo.maratonajava.introducao;

import java.text.Format;

public class Aula06EstruturasDeRepeticao05 {
    static void main() {
        double valorCarro = 30000;
        double valorParcela = 0;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(parcela + " vezes de " + "R$" + String.format("%.2f",valorParcela));
        }
    }
}
