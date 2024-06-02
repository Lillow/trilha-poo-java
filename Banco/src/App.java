public class App {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco X");
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        Conta contaCorrente = new ContaCorrente(banco, cliente1);
        Conta contaPoupanca = new ContaPoupanca(banco, cliente2);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}