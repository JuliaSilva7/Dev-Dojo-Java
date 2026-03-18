package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main() {
        String resultado;
        int salario = 6000;
        String podeDoar = "É possível realizar a doação.";
        String naoPodeDoar = "Não é possível realizar a doação.";

        // condicao ? verdadeiro: falso
        resultado = salario >= 5000 ? podeDoar: naoPodeDoar;

        System.out.println(resultado);
    }
}
