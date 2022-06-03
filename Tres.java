import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        
        int contador = 0;
        int menor = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
       
        while(contador<1){
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
       contador ++;
        }
        System.out.println("Soma dos dois maiores: " + ((num1+num2+num3) - menor));
    }
}