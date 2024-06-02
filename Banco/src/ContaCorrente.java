class ContaCorrente extends Conta {
    public ContaCorrente(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato da Conta Corrente ***");
        super.imprimirInfoComuns();
    }
}