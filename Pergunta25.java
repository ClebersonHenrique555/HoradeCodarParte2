import java.util.Scanner;
import java.util.Scanner;

public class Pergunta25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int conta;

        Double valor1, valor2;

        System.out.println("Digite um numero");
        valor1 = ler.nextDouble();

        System.out.println("Digite um numero");
        valor2 = ler.nextDouble();

        System.out.println("Digite o tipo de conta que você deseja realizar  1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação");
        conta = ler.nextInt();



        if(conta == 1){
            System.out.println(valor1 + valor2);
        }
        if(conta == 2){
            System.out.println(valor1 - valor2);
        }
        if(conta == 3){
            System.out.println(valor1 / valor2);
        }
        if(conta == 4){
            System.out.println(valor1 * valor2);
        }
    }
}
