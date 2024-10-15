import java.util.Scanner;

public class ContaTerminal {

    Scanner scanner = new Scanner(System.in);

    public void novaConta() {

        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco," +
                " sua agência é " +agencia+", conta "+numero+ " e seu saldo " + "R$"+saldo+
                ", já está disponível para saque");
    }
}
