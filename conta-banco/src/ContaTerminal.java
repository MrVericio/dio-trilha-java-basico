
import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o usuário

        // Obter pelo Scanner os valores digitados pelo usuário no terminal

        // Exibir a mensaem conta criada

        System.out.println("Digite o número da conta:");
        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine();
        System.out.println("Número da conta: " + numeroConta);
        // Receber o número da conta digitada pelo usuário e exibir no terminal

        System.out.println("Digite o número da agência:");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Número da agência: " + numeroAgencia);
        // Receber o número da agência digitada pelo usuário e exibir no terminal

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Nome do cliente: " + nomeCliente);
        // Receber o nome do cliente digitado pelo usuário e exibir no terminal

        double saldo = 523.02;
        System.out.println("Saldo da conta: " + saldo);
        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        // Exibir a mensagem final para o cliente, seguindo o modelo: "Olá [nome do
        // cliente], obrigado por criar uma conta em nosso banco, sua agência é [número
        // da agência], conta [número da conta] e seu saldo [saldo da conta] já está
        // disponível para saque."
        scanner.close();
        // Fechar o Scanner
    }

}
