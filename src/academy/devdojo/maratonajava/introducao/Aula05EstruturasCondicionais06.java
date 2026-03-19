package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main() {
        int dia = 5;

        switch (dia){
            case 1,7 -> System.out.println("Não é dia útil.");
                
            case 2,3,4,5,6 -> System.out.println("É dia útil.");
                
            default -> System.out.println("Valor Inválido");
                
        }
    }
}
