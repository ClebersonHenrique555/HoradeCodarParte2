import java.util.Scanner;
public class Pergunta15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /* Escreva um programa para ler o ano de nascimento de uma pessoa
        e escrever uma mensagem que diga se ela poderá ou não votar este ano 
        (não é necessário considerar o mês em que ela nasceu).  */
        
        int ano_de_nascimento;
        int ano_atual = 2022;

        System.out.println("Qual o seu ano de nascimento?");
        ano_de_nascimento = ler.nextInt();

        int verifica_se_pode_votar = ano_atual - ano_de_nascimento;

        if(verifica_se_pode_votar>=16){
            System.out.println("Você pode votar");
        }else{
            System.out.println("Você NÃO pode votar");
        }

       
    }
}