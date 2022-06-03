import java.util.Scanner;
public class Pergunta18 {
    public static void main(String[] args) {

        /*Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino)
         de uma pessoa,
         construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:*/

        Scanner ler = new Scanner(System.in);

        Double altura;
        int sexo;

            System.out.println("Digite o seu sexo: 1 para feminino e 2 para masculino");
            sexo = ler.nextInt();

            System.out.println("Digite a sua altura");
            altura = ler.nextDouble();

            Double peso_ideal_feminino = (62.1 * altura) - 44.7;
            Double peso_ideal_masculino = (72.7 * altura) - 58.0;

            if (sexo == 1){
                System.out.println("Seu peso ideal: " + peso_ideal_feminino);
            }if (sexo == 2){
                System.out.println("Seu peso ideal: " + peso_ideal_masculino);
            }
    }
}
