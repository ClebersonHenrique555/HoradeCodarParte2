import java.util.Scanner;
public class Pergunta9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*Faça um programa que leia 6 números que o usuário vai informar. 
        Todos os números lidos com valor inferior a 72 devem ser somados. 
        Escreva o valor final da soma efetuada e também todos valores que o usuário informou.   */
        
        int contador = 0;
        int numeros = 0;
        int soma = 0;

        while (contador<6){
            System.out.println("Digite um numero");
            numeros = ler.nextInt();
            if(numeros < 72)
            soma += numeros;
            contador++;
        }
        System.out.println(soma);
    }
}