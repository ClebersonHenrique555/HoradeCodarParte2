import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double preco_combustivel=2.90;
        Double odometro_inicio_dia = 0.0;
        Double odometro_fim_dia;
        
        System.out.println("Digite a quantidade de KM rodados:");
        odometro_fim_dia = ler.nextDouble();
        
        Double total_litros_gasolina_gasta;
        System.out.println("Digite a quantidade de gasolina gasta (Em litros)");;
        total_litros_gasolina_gasta = ler.nextDouble();
        
        Double total_recebido_dos_passageiros;
        System.out.println ("Digite a quantidade de dinheiro recebido");
        total_recebido_dos_passageiros = ler.nextDouble();
        
        Double lucro_liquido=total_recebido_dos_passageiros-(total_litros_gasolina_gasta * preco_combustivel);
        
        System.out.println("Média do consumo em Km/L: "+ odometro_fim_dia/total_litros_gasolina_gasta);
        System.out.println(" ");
        System.out.println("Lucro Liquido: "+ lucro_liquido + " reais");
        
    }
}
