import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        int agency = Integer.parseInt(scanner.nextLine());

        System.out.print("Por favor, digite o número da conta: ");
        String account = scanner.nextLine();

        System.out.print("Por favor, digite o nome do titular: ");
        String owner = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double balance = scanner.nextDouble();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo de R$%.2f já está disponível para saque.", owner, agency, account, balance);

    }
}
