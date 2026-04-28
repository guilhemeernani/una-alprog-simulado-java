import java.util.Scanner;

public class atvjavasimulado{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = sc.nextDouble();

        // Validação
        if (valorPago < valorCompra) {

            System.out.println("Valor insuficiente para realizar suas compras!");

        } else {

            // Cálculo do troco
            int troco = (int)(valorPago - valorCompra);

            System.out.println("\n===== RECIBO =====");
            System.out.println("Cliente: " + nome);
            System.out.println("Valor da compra: R$ " + valorCompra);
            System.out.println("Valor pago: R$ " + valorPago);
            System.out.println("Troco: R$ " + troco);

            // Cálculo das notas
            int nota200 = troco / 200;
            troco %= 200;

            int nota100 = troco / 100;
            troco %= 100;

            int nota50 = troco / 50;
            troco %= 50;

            int nota20 = troco / 20;
            troco %= 20;

            int nota10 = troco / 10;
            troco %= 10;

            int nota5 = troco / 5;
            troco %= 5;

            int nota2 = troco / 2;
            troco %= 2;

            int nota1 = troco;

            // Saída das notas
            System.out.println("\nNotas para o troco:");

            if (nota200 > 0)
                System.out.println(nota200 + " nota(s) de R$200");

            if (nota100 > 0)
                System.out.println(nota100 + " nota(s) de R$100");

            if (nota50 > 0)
                System.out.println(nota50 + " nota(s) de R$50");

            if (nota20 > 0)
                System.out.println(nota20 + " nota(s) de R$20");

            if (nota10 > 0)
                System.out.println(nota10 + " nota(s) de R$10");

            if (nota5 > 0)
                System.out.println(nota5 + " nota(s) de R$5");

            if (nota2 > 0)
                System.out.println(nota2 + " nota(s) de R$2");

            if (nota1 > 0)
                System.out.println(nota1 + " nota(s) de R$1");
        }

        sc.close();
    }
}