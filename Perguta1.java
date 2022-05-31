import java.util.Scanner;
public class Perguta1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x, y;

        System.out.println("Digite um numero");
        x = ler.nextInt();
        System.out.println("Digite um numero");
        y = ler.nextInt();

        if (x>y){
            System.out.println("O maior numero é "+ x);
        }else{
            System.out.println("O maior numero é " + y);
        }
    }
}
