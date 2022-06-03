import java.util.Scanner;
public class Pergunta10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
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

            System.out.println(media);
    }
}
    