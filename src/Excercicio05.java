import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorhoraaula , numerohorastrabalhadasmes , procentagemdescontoinss , salariobruto , percentualinss;


                //solicitar o usuario para colocar dados

        System.out.println("Digite o valor da hora-aula : ");
        valorhoraaula = sc.nextDouble();
        System.out.println("Digite  o número de horas trabalhadas no mês : ");
        numerohorastrabalhadasmes = sc.nextDouble();
        System.out.println("Digite a porcentagem de desconto pelo INSS : ");
        percentualinss = sc.nextDouble();

        //calculando salario bruto

        salariobruto = valorhoraaula * numerohorastrabalhadasmes;
        double descontoinss = salariobruto * (percentualinss/100);

        // Calcula o salário líquido (salário bruto - desconto do INSS)
        double salarioLiquido = salariobruto - percentualinss;;
        // Exibe o salário líquido com 2 casas decimais
        System.out.printf("O salário líquido mensal do professor é: R$ %.2f\n",+ salarioLiquido);;
        System.out.println("Salario bruto R$ " + df.format(salariobruto));



    }
}
