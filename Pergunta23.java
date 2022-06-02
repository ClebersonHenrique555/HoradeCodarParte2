import java.util.Scanner;
public class Pergunta23 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = 0;
        int menor = 0;
        int contador = 0;
        int maior = 0;

        while (contador<3){
        System.out.println("Digite um numero");
        numero = ler.nextInt();
       
        if(numero>maior){
            maior = numero;
        
        }if(menor<numero){
            menor = numero;
        }

        contador += 1;

        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero " + menor);
    }
}

    

