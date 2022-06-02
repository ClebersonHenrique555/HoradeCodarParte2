import java.util.Scanner;

public class Pergunta24 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int idadeGirafa1;
        int idadeGirafa2;

        int javali_mais_velho;
        int javali_mais_novo;

        int girafa_mais_nova;
        int girafa_mais_velha;
        
        int idadeJavali1;
        int idadeJavali2;

        System.out.println("Digite a idade da girafa 1");
        idadeGirafa1 = ler.nextInt();

        System.out.println("Digite a idade da girafa 2");
        idadeGirafa2 = ler.nextInt();

        System.out.println("Digite a idade do javali 1");
        idadeJavali1 = ler.nextInt();

        System.out.println("Digite a idade do javali 2");
        idadeJavali2 = ler.nextInt();



        //soma das idades do javali mais velho com a girafa mais nova
        //produto das idades do javali mais novo com a girafa mais velha.


        if (idadeJavali1 > idadeJavali2){
            javali_mais_velho = idadeJavali1;
        }else{
            javali_mais_velho = idadeJavali2;
        }

        if(idadeGirafa1<idadeGirafa2){
            girafa_mais_nova = idadeGirafa1;
        }else{
            girafa_mais_nova = idadeGirafa2;
        }
        //----------------------------------------------//

        if (girafa_mais_nova == idadeGirafa1){
            girafa_mais_velha = idadeGirafa2;
        }else{
            girafa_mais_velha = idadeGirafa1;
        }

        if (javali_mais_velho == idadeJavali1){
            javali_mais_novo = idadeJavali1;
        }else{
            javali_mais_novo = idadeJavali2;
        }

        System.out.println("soma das idades do javali mais velho com a girafa mais nova: " + (girafa_mais_nova + javali_mais_velho));
        System.out.println("produto das idades do javali mais novo com a girafa mais velha: " + (javali_mais_novo * girafa_mais_velha));
    }
}