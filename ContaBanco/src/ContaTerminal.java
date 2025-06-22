import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declaring variables to store customer data
        String nomeCliente = "";
        int numero = 0;
        String agencia = "";
        double saldo = 0.00;

        System.out.println("Bem-vindo ao Banco Santander!");

        boolean inputValid = false;
              
        while (!inputValid) {
            try {
                System.out.print("Por favor, digite o seu nome: ");
                nomeCliente = scanner.nextLine();

                System.out.print("Por favor, digite o número da sua conta: ");
                numero = scanner.nextInt();

                scanner.nextLine();
                System.out.print("Por favor, digite o número da agência: ");
                agencia = scanner.nextLine();

                System.out.print("Por favor, digite o valor de depósito inicial: ");
                saldo = scanner.nextDouble();

                inputValid = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida! \n Por favor, digite a informação solicitada corretamente.");
                scanner.nextLine(); // Clearing the scanner buffer to avoid infinite loop
            }

        }

        // Showing the final message with the account details
        String messageFinal = "";
                
        messageFinal = messageFinal.concat("Olá, ").concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ")
                .concat(String.format("%.2f", saldo) ).concat(" já está disponível para saque.");

                //  .concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(messageFinal);

        // Closing the scanner
        scanner.close();

    }
}
