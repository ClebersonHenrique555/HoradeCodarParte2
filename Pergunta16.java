import java.util.Scanner;
public class Pergunta16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /* As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
        e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas
         (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.*/

        Double macas_compradas = 0.0;
        
        System.out.println("Quantas maças você comprou?");
        macas_compradas = ler.nextDouble();

        Double valor_sem_promocao = macas_compradas * 0.30;
        Double valor_com_promocao = macas_compradas * 0.25; 


        if(macas_compradas<12){
            System.out.println("Valor total da compra SEM promoção: " + valor_sem_promocao );
        }else{
            System.out.println("Valor total da compra COM promoção: " + valor_com_promocao);
        }

       
    }
}