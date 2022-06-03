import java.util.Scanner;
public class Quatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int soma = 0;
        int contador = 0;

        System.out.println("Informe um numero");
        num = ler.nextInt();

        while(contador<10){
            System.out.println("Informe um numero");
            num = ler.nextInt();
            
            soma += num;
            contador++;
        }
        System.out.println("Média Aritmética: " + soma / 10);
    }
}
