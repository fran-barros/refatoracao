package com.exemplo.refatoracao;

import java.util.ArrayList;
import java.util.List;

public class Crud {

    public static void main(String[] args) {
        List<Conta> contas =  new ArrayList<>();

        for (int i = 0 ;  contas.size() < 5 ; i++) {
            incluirConta(contas);
        }
    }

    public static boolean procuraContaDuplicada(List<Conta> contas, int numero){

        for (int i = 0; i < contas.size(); i++) {

            if (numero == contas.get(i).getNumero()) {
                return true;
            }
        }
        return false;
    }


    public static void incluirConta(List<Conta> contas) {
        Conta conta = new Conta();

        int numero =  conta.scannerNumero();
        boolean duplicada = procuraContaDuplicada(contas, numero);
        if (duplicada) {
            System.out.println("Erro: conta já existe. Tente novamente com outro número.");
        }
        else {
            String nome = new Cliente().scannerNome();

            conta.setNumero(numero);
            conta.setCliente(new Cliente(nome));
            conta.setSaldo(conta.scannerSaldo());

            contas.add(conta);

            System.out.println("Conta adicionada para " + conta.getCliente().getNome());
        }
    }
}
