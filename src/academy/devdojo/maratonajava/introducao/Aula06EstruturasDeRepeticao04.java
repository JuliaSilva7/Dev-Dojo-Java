package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    static void main() {
        // Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        // ValorParcela = 1000
        double valorCarro = 12350;
        double valorParcela = 0;

        for (int parcela = 1; parcela <=valorCarro; parcela++){
            valorParcela = valorCarro / parcela;
            if (valorParcela<1000){
                break;
            }
            System.out.println("Quantidade de parcelas " + parcela + " de R$" + String.format("%.2f", valorParcela));
        }

    }
}
