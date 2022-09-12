package com.exemplo.refatoracao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conta {

    private int numero;
    private double saldo;

    private Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta() {
    }

    public int getNumero() {
        return this.numero;
    }

    public int scannerNumero() {
        boolean ok = false;
        Integer numero = 0;
        Scanner entrada = new Scanner(System.in);

        while (!ok) {
            try {
                System.out.println("Entre com o número da conta: ");
                numero = entrada.nextInt();

                ok = true;
            }
            catch (InputMismatchException e) {

                System.out.println("Erro: número inválido");
                entrada.next();
                ok = false;
            }
        }
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double scannerSaldo() {
        boolean ok = false;
        double saldo = 0;
        Scanner entrada = new Scanner(System.in);

        while (!ok) {
            try {
                System.out.println("Entre com o saldo da conta: ");

                saldo = entrada.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {

                System.out.println("Erro: número inválido");

                entrada.next();
                ok = false;
            }
        }
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
