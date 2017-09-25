/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author estagiario
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------Cadastar------------");
        System.out.println("Homem");

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Data de Nascimento:");
        String dataNascimento = sc.nextLine();

        System.out.println("Peso:");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.println("Altura:");
        double altura = Double.parseDouble(sc.nextLine());

        PessoaIMC h = new Homem(peso, altura, nome, dataNascimento);

        System.out.println("----------Cadastar------------");
        System.out.println("Mulher");

        System.out.println("Nome:");
        String nome2 = sc.nextLine();

        System.out.println("Data de Nascimento:");
        String dataNascimento2 = sc.nextLine();

        System.out.println("Peso:");
        double peso2 = Double.parseDouble(sc.nextLine());

        System.out.println("Altura:");
        double altura2 = Double.parseDouble(sc.nextLine());

        PessoaIMC m = new Mulher(peso2, altura2, nome2, dataNascimento2);

         System.out.println("----------------Homem--------------");
        System.out.println(h.toString()); 
        
        System.out.println("IMC:" +h.resultIMC());
        
         System.out.println("----------------Mulher--------------");
        System.out.println(m.toString()); 
        System.out.println("IMC:" +m.resultIMC());
       
    }
}
