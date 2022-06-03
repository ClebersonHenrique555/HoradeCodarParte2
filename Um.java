import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        int numero;
        int contador = 0;

        while(contador<50){
        System.out.println("Digite um numero");
        


        numero = ler.nextInt();

            if (numero>0){
                System.out.println("É positivo");
                System.out.println(" ");
            }else if (numero<0){
                System.out.println("É negativo");
                System.out.println(" ");
                
            }else{
                System.out.println("O valor é zero");
                System.out.println(" ");
            }
            contador++;
        }
    }
}