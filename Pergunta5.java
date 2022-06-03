import java.util.Scanner;
public class Pergunta5 {
public static void main(String[] args) {
//5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.
Scanner ler = new Scanner(System.in);

int num1,num2;

System.out.println("Digite um numero");
num1 = ler.nextInt();

System.out.println("Digite um numero");
num2 = ler.nextInt();

if(num1==num2){
    System.out.println("Numeros iguais");
}else if(num1>num2){
    System.out.println("Primeiro é maior");
}else{
    System.out.println("Segundo é maior");
}
}
}
