package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main() {
        // Imprima os números pares de 0 à 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Usando while
        int num = 0;
        while (num <= 1000000) {
            num ++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        do {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        } while (num <= 1000000);

    }
}
