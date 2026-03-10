public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        // Recebe um valor de saque e subtrai do saldo, se o valor for menor que o saldo
        double valorSaque = 17.0;
        // Recebe um valor de saque e subtrai do saldo, se o valor for menor que o saldo

        if (valorSaque < saldo)
            saldo = saldo - valorSaque;
        // Recebe um valor de saque e subtrai do saldo, se o valor for menor que o saldo

        System.out.println("Saldo: " + saldo);
        // Imprime o saldo atualizado após o saque

    }
}
