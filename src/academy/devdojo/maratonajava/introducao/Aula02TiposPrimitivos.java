package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        // int, double, float, char, byte, short, long, boolean
        //Cash : força um valor de um tipo de váriavel pra outra
        int idade = (int) 10000000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Julia";

        System.out.println(idade);
        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi, meu nome é "+ nome);
    }
}
