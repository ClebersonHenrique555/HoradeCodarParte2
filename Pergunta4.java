import java.util.Scanner;
public class Pergunta4 {
    public static void main(String[] args) {
        //4. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
        Scanner ler = new Scanner(System.in);

        int menor;
        int num1, num2, num3;

        System.out.println("Digite um numero");
        num1 = ler.nextInt();

        System.out.println("Digite um numero");
        num2 = ler.nextInt();

        System.out.println("Digite um numero");
        num3 = ler.nextInt();

       if(num1<num2){
           menor = num1;
       }else{
           menor = num2;
       }if(menor<num3){
           menor = menor;
       }else{
           menor = num3;
       }
       System.out.println((num1+num2+num3) - menor);
}
}