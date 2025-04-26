
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 2518.00;

        System.out.println("Olá, seja bem-vindo ao banco!");
        System.out.println("Por favor, digite o número da agência: ");
        agencia = System.console().readLine();
        System.out.println("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = System.console().readLine();

        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
            "Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + 
            " já está disponível para saque.");
    }
}
