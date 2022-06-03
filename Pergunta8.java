import java.util.Scanner;
public class Pergunta8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int contador = 0;
        int numeros = 0;
        int soma = 0;

        while (contador<10){
            System.out.println("Digite um numero");
            numeros = ler.nextInt();
            soma += numeros;
            contador++;
        }
        System.out.println(soma);
    }
}
