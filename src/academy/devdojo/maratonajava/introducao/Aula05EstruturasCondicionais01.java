package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main() {
        int idade = 10;
        boolean autorizadoComprarBebida = idade>= 18;

        if (autorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcóolica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcóolica");
        }
        if (!autorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcóolica");
        }

    }
}
