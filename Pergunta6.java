import java.util.Scanner;
public class Pergunta6 {
    public static void main(String[] args) {
        //6.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
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
        System.out.println(soma);
    }
}
