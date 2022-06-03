import java.util.Scanner;
public class Pergunta2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x, y;

        System.out.println("Digite um numero");
        x = ler.nextInt();
        

        if (x>0){
            System.out.println("O numero é positivo");
        }else if(x<0){
            System.out.println("O numero é negativo");
        }else{
            System.out.println("O numero é zero");
        }
    }
}