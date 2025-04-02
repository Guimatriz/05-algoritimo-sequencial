import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero , ultimadezena;

        System.out.println("Digite um numero de tres digitos: ");
        numero = sc.nextInt();

        ultimadezena = (numero /10) %10;

        System.out.println("A dezena do numero informado e : " +ultimadezena);


    }
}
