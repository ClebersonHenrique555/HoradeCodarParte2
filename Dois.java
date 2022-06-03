import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;

        while(contador<3){
        System.out.println("Digite um numero");
        numero = ler.nextInt();

            if (numero>maior){
                maior = numero;
            }else{
                maior = maior;
            }
            contador++;
        }
        System.out.println("O maior numero digitado foi: " + maior);
    }
}