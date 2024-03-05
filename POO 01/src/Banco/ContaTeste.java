package Banco;

import Banco.ContaBancaria;

class ContaTeste {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();


        c1.Titular = "Newton";
        c1.saldo = 1000;
        c1.numero = 120;

        c2.Titular = "Maria";
        c2.saldo = 2000;
        c2.numero = 450;

        c1.consultarSaldo();
        c2.consultarSaldo();
        c1.depositar(500);
        c2.sacar(300);
        c1.consultarSaldo();
        c2.consultarSaldo();

        System.out.println("Titular da conta é: " + c1.Titular + " e o saldo é: " + c1.saldo +
                " e o número da conta é: " + c1.numero);
        System.out.println("Titular da conta é: " + c2.Titular + " e o saldo é: " + c2.saldo + " " +
                "e o número da conta é: " + c2.numero);
    }
}
