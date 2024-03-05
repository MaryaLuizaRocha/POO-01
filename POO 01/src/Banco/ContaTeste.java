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

        System.out.println("Titular: " + c1.Titular);
        System.out.println("Saldo: " + c1.saldo);
        System.out.println("Numero: " + c1.numero);

        System.out.println("Titular: " + c2.Titular);
        System.out.println("Saldo: " + c2.saldo);
        System.out.println("Numero: " + c2.numero);
    }
}
