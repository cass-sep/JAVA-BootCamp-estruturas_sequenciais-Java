package sequencial;

public class Variaveis {
    public static void main(String[] args) {
        int quantidade = 1500;
        float valorMercadoria = 750.28f;
        double peso = 78.3;
        char genero = 'F';

        System.out.printf("A quantidade de itens no estoque é %d.\n", quantidade);
        System.out.printf("O valor da parcela é R$%.1f.\n", valorMercadoria);
        System.out.printf("O Erinaldo pesa %.1fkg.\n", peso);
        System.out.printf("Do gênero %c tem matriculadas %d alunas.\n", genero, quantidade);
    }
}
