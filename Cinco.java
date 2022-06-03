import java.util.Scanner;
public class Cinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Double nota = 0.0;
        int contador = 0;
        Double soma = 0.0;

        while(contador<4){
            System.out.println("Informe a nota");
            nota = ler.nextDouble();

            if(nota >=0 && nota <=10){
                soma += nota;
                contador ++;
            }else{
            contador = 5;
            System.out.println("Nota Invalida, por favor tente novamente!");
            }
        }

        Double media = soma / 4;

        if (media>=6){
            System.out.println("Parabéns, você foi aprovado! Sua média: " + media);
        }else{
            System.out.println("Infelizmente você foi reprovado! Sua média: " + media);
        }

        
    }
}
