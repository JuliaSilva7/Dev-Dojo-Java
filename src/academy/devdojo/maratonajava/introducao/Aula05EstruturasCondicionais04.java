package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main() {
        double salarioAnual = 100000;
        double imposto;

        if (salarioAnual <= 34712) {
            imposto = salarioAnual* 0.097;
            System.out.println("O imposto a ser pago é de " + imposto);
        }
        else if ( salarioAnual > 34712 && salarioAnual <= 68507) {
            imposto = salarioAnual * 0.3735;
            System.out.println("O imposto a ser pago é de " + imposto);
        }
        else{
            imposto = salarioAnual * 0.49;
            System.out.println("O imposto a ser pago é de " + imposto);
        }

    }
}
