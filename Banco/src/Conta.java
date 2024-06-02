abstract class Conta implements IConta {

    private static int sequencial = 1;
    private static final int AGENCIA_PADRAO = 3;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Banco banco, Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.cliente = cliente;
        this.banco = banco;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComuns() {
        System.out.println("Banco: " + banco.getNome());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.printf("Agência: %d\n", this.getAgencia());
        System.out.printf("Número: %d\n", this.getNumero());
        System.out.printf("Saldo: %.2f\n", this.getSaldo());
    }
}