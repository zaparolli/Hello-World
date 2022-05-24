package com.pathtodev;

import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1 - Exercício: Crie um programa que efetue a leitura de um nome e exiba a mensagem “olá nome informado“.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Ola " + nome + "!");

    }
}
