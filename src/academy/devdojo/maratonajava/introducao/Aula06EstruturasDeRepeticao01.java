package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main() {
        // while, do while, for
        int count = 0;
        while (count<10){
            System.out.println(++count);
        }


        do {
            System.out.println("Executa ao menos uma vez.");
        }while (count<5);


        for (int i =0; i<10;i++){
            System.out.println("O valor é " + i);
        }
    }
}
