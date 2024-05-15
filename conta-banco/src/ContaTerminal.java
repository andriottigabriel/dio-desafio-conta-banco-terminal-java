import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("");

        // Solicita e recebe o número da conta
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        // Solicita e recebe o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e recebe o saldo da conta
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de $" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
