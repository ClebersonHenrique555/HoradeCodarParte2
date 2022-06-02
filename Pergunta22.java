import java.util.Scanner;
public class Pergunta22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantidade_parcelas = 0;
        Double valor_capacete = 18230.0;

        System.out.println("Digite a quantidade de parcelas");
        quantidade_parcelas = ler.nextInt();
        Double valor_parcela = valor_capacete / quantidade_parcelas;

        if (quantidade_parcelas>15){
            System.out.println("O valor de cada parcela ficará em: " + valor_parcela + " + Juros");
        }else{
            System.out.println("O valor de cada parcela ficará em: " + valor_parcela + " sem Juros");
        }
    }
}

    

