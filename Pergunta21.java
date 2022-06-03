import java.util.Scanner;
public class Pergunta21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Double nota1, nota2, nota_optativa;
        
        
        System.out.println("Digite a nota 1:");
        nota1 = ler.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = ler.nextDouble();

        System.out.println("Digite a nota optativa:");
        nota_optativa = ler.nextDouble();
            
                        if(nota1<nota2){
                            nota1=nota_optativa;
                        }else{
                            nota2=nota_optativa;
                        }

                        Double media = ((nota1+nota2)/2);
                        
                        System.out.println((nota1+nota2)/2);
                        if(media>=6){
                            System.out.println(" Parabéns, você foi aprovado!");
                        
                        }else if(media<3){
                            System.out.println(" Infelizmente você foi reprovado!");
                        }else if(media>=3 && media <6){
                            System.out.println(" Você está de recuperação!");
                        }

    }
}
           
            


