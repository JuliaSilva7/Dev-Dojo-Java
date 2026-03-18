package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main() {
        int idade = 8;
        String categoria = " ";
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
    }
}
