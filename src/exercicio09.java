import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero , centena , dezena , unidade;




        System.out.println("Digite um numero de tres digitos: ");
        numero = sc.nextInt();

        centena = (numero /100) %10;
        dezena = (numero /10) %10;
        unidade= (numero / 1) %10;



        System.out.println("O seu numero inverso e  : " + unidade + dezena + centena);


    }
}
