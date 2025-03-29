package ContaBanco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número do cliente: ");
        numero = teclado.nextInt();

        System.out.println("Digite o nome da agência: ");
        agencia = teclado.next();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = teclado.next();

        System.out.println("Digite o saldo do cliente: ");
        saldo = teclado.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo " +
                df.format(saldo)+" já está disponível para saque");
    }
}
