package sequencial;
import java.util.Scanner;


public class Desconto {
    public static void main(String[] args) {
        double salario, descontoInss;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do salário:");
        salario = sc.nextDouble();
        System.out.println("Insira o valor do desconto:");
        descontoInss = sc.nextDouble();
        salario = salario * (1 - descontoInss / 100);

        System.out.printf("O valor do salário bruto após o desconto do INSS será de R$%.2f.", salario);
        sc.close();
    }
}
