package Banco;

class ContaBancaria {

    String Titular;
    double saldo;
    int numero;

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

}
