import java.util.Scanner;
public class Pergunta19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int gols_São_Paulo = 623;
        int gols_Corinthans = 526;

        if(gols_São_Paulo>gols_Corinthans){
            System.out.println("Vai São Paulo!");
        }
        if(gols_Corinthans==gols_São_Paulo){
            System.out.println("Empate");
        }else{
            System.out.println("Vai Corinthans!");
        }

       
    }
}