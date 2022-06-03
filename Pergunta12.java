import java.util.Scanner;
public class Pergunta12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tamanhoPista;
        System.out.println("Informe o tamanho da pista (em metros)");
        tamanhoPista = ler.nextInt();

		int voltas; 
        System.out.println("Informe o numero de voltas");
        voltas = ler.nextInt();

		int numReabastecimento;
        System.out.println("Quantos reabastecimentos deseja fazer");
        numReabastecimento = ler.nextInt();

		int consumoCarro;
        System.out.println("Qual o consumo do carro (km/l)");
        consumoCarro = ler.nextInt();

		//quantidade de voltas até a parada 1
		int voltasParada1 = voltas/numReabastecimento;


		//distancia parada 1 
		int distanciaParada1= (voltasParada1 * tamanhoPista) / 1000;

		//consumo ate a parada 1
		int consumoParada1 = consumoCarro / distanciaParada1;

		System.out.println("a distancia percorrida até a primeira parada é: " + distanciaParada1);

		System.out.println("O numero de voltas até a primeira parada é: " + voltasParada1);

		System.out.println("O carro vai gastar " + consumoParada1 + " até a parada 1");
    }
    
}
