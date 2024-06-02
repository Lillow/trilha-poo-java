class ContaPoupanca extends Conta {
    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato da Conta Poupança ***");
        super.imprimirInfoComuns();
    }
}