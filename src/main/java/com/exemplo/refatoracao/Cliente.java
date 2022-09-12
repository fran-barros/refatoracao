package com.exemplo.refatoracao;

import java.util.Scanner;

public class Cliente {
    private String nome;

    public Cliente(){}

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String scannerNome(){
        boolean ok = false;
        String nome = "";
        Scanner entrada = new Scanner(System.in);

        while (!ok) {
            System.out.println("Entre com o nome do cliente: ");

            nome = entrada.nextLine();

            String[] nomes = nome.split(" ");

            if (nomes.length >= 2) {
                ok = true;
            } else {
                System.out.println("Erro: nome inválido");
                ok = false;
            }
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
