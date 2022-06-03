import java.util.Scanner;
public class Pergunta20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero_de_lados;
        
        System.out.println("Digite o numero de lados:");
        numero_de_lados = ler.nextInt();

        if(numero_de_lados==3){
            System.out.println("É um triângulo! O valor do perimetro é: " + (3*numero_de_lados) );
        }
        if(numero_de_lados==4){
            System.out.println("É um quadrado! O valor da area: " + (numero_de_lados*numero_de_lados));
        }

        if (numero_de_lados==5){
            System.out.println("É um Pentágono");
        }


    }

}
