import java.util.Scanner;
public class Pergunta7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*
        Faça um programa que receba quatro valores informados pelo usuário,
         mas informe somente o primeiro, o último e o maior de todos eles
         (considere que todos os números informados serão diferentes)
        */

        int num1, num2, num3, num4;

        int maior;

        System.out.println("Digite um numero");
        num1 = ler.nextInt();

        System.out.println("Digite um numero");
        num2 = ler.nextInt();

        System.out.println("Digite um numero");
        num3 = ler.nextInt();

        System.out.println("Digite um numero");
        num4 = ler.nextInt();

        if (num1>num2){
            maior = num1;
            }else{
                maior = num2;
            }if (maior > num3){
                maior = maior;
            }else{
                maior = num3;
            }if (maior>num4){
                maior = maior;
            }else{
                maior = num4;
            }

        System.out.println("O primeiro numero:" + num1);
        System.out.println("O ultimo numero:" + num4);
        System.out.println("O maior numero:" + maior);
    }
}
