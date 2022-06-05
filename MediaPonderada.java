package sequencial;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        double mediaPonderada;

        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a nota 4: ");
        nota4 = sc.nextDouble();

        mediaPonderada = (nota1*2 + nota2*2 + nota3*3 + nota4*3)/10;

        System.out.printf("As notas são %.1f, %.1f, %.1f, %.1f.\n", nota1, nota2, nota3, nota4);
        System.out.printf("A média ponderada dessas notas é %.1f", mediaPonderada);

        sc.close();
    }
}
