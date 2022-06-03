import java.util.Scanner;
public class Pergunta3 {
    public static void main(String[] args) {

        //3.Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
        Scanner ler = new Scanner(System.in);

        int num1, num2, num3;

        int maior;
         
        System.out.println("Digite um numero");
        num1 = ler.nextInt();

        System.out.println("Digite um numero");
        num2 = ler.nextInt();

        System.out.println("Digite um numero");
        num3 = ler.nextInt();
        if(num1>num2){
            maior = num1;
        }else{
            maior = num2;
        }if(maior>num3){
            maior = maior;
        }else{
            maior = num3;
        }
        System.out.println(maior);
    }
}
