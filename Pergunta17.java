import java.util.Scanner;
public class Pergunta17 {
    public static void main(String[] args) {

        /*Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
         A senha válida é o número "1234" sem aspas. Devem ser impressas as seguintes mensagens:
         "ACESSO PERMITIDO" caso a senha seja válida. "ACESSO NEGADO" caso a senha seja inválida. */

        Scanner ler = new Scanner(System.in);

        int senha_valida = 1234;
        int senha_digitada;
        int contador = 0;

        while(contador<5){
            System.out.println("Digite a senha");
            senha_digitada = ler.nextInt();
            
            if (senha_digitada == senha_valida){
                System.out.println("ACESSO LIBERADO");
            }else{
                System.out.println("ACESSO NEGADO");
                contador += 1;
            }
        }
        System.out.println("CONTA BLOQUEADA POR MOTIVOS DE SEGURANÇA");
        
    }
}
