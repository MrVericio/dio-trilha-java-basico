
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o usuário

        // Obter pelo Scanner os valores digitados pelo usuário no terminal

        // Exibir a mensaem conta criada

        System.out.println("Digite o número da conta:");

        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine();
        System.out.println("Número da conta: " + numeroConta);

        System.out.println("Digite o número da agência:");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Número da agência: " + numeroAgencia);
        
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();
        System.out.println("Nome do cliente: " + nomeCliente);

        double saldo = 523.02;
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    
        scanner.close();
    }

        
        
}
