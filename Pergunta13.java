import java.util.Scanner;
public class Pergunta13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre,
         calcular e escrever a média do semestre e a seguinte mensagem:
          PARABÉNS! Você foi aprovado! somente
         se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas). */
        
         int contador = 0;
        int numeros;
        int soma = 0;
        

        while (contador<4){

            System.out.println("Digite um numero");
            numeros = ler.nextInt();
            
            if (numeros>=0 && numeros <=10){
            soma += numeros;
            contador++;

            }else{
            System.out.println("Digite um numero válido");
            numeros = ler.nextInt();
            }
            
        }
            int media = soma / 4;
            if(media>=6){
                System.out.println("Parabéns, você passou! Sua média foi " + media);
            }else{
            System.out.println("Infelizmente você foi reprovado! Sua média foi " + media);
            }
    }
}