package sequencial;
import java.util.Scanner;

public class Aumento2 {
    public static void main(String[] args) {
        double salarioBruto, percentual, salarioNovo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do salário: ");
        salarioBruto = sc.nextDouble();
        System.out.println("Informe o percentual de aumento: ");
        percentual = sc.nextDouble();

        salarioNovo = salarioBruto * (1 + percentual / 100);

        System.out.printf("O valor do salário passará de R$%.2f para R$%.2f.", salarioBruto, salarioNovo);
        sc.close();
    }
}
