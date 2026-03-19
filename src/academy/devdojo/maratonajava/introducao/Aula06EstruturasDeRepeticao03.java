package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    static void main() {
        // Imprimir 25 números de 50
        for (int i = 1; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
