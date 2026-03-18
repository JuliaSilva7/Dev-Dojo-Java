package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main() {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // < > <= >= == !=
        int resto = 21 % 7;
        System.out.println(resto);
        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorQueVinte = 10 < 20;
        boolean dezIgualVinte = 10 == 20;
        boolean dezIgualDez = 10 == 10.0;
        boolean dezDiferenteDez = 10 != 10.0;
        System.out.println("dezMaiorQueVinte: " + dezMaiorQueVinte);
        System.out.println("dezMenorQueVinte: " + dezMenorQueVinte);
        System.out.println("dezIgualVinte: " + dezIgualVinte);
        System.out.println("dezIgualDez: " + dezIgualDez);
        System.out.println("dezDiferenteDez: " + dezDiferenteDez);

        // && (and), or (||), nor (!)
        int idade = 29;
        float salario = 3500F;
        boolean dentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean dentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println("Dentro da Lei Maior que 30: " + dentroDaLeiMaiorQue30);
        System.out.println("Dentro da Lei Menor que 30: " + dentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean playstationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Plasystation 5 é comprável: " + playstationCincoCompravel);

        // =, ==, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
