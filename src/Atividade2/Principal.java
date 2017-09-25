/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

import java.util.Scanner;

/**
 *
 * @author estagiario
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario g = new Gerente();
        System.out.println("------Cadastar Gerente------");

        System.out.println("Nome:");
        g.setNome(sc.nextLine());

        System.out.println("Salario:");
        g.setSalario(Double.parseDouble(sc.nextLine()));

        //Cria um novo Programador
        Funcionario p = new Programador();
        System.out.println("------Cadastar Programador------");

        System.out.println("Nome:");
        p.setNome(sc.nextLine());

        System.out.println("Salario:");
        p.setSalario(Double.parseDouble(sc.nextLine()));

        do {
            int opcao = 0;

            //opaçao 1 
            System.out.println("-----------------Opçoes----------------:");
            System.out.println("Digite 1 para Imprimir  ou 2 Aumentar Salario e 0 para sair");
            System.out.println("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            //opçao 2
            System.out.println("Escolha Um Funcionario ");
            System.out.println("1-Programador ");
            System.out.println("2-Gerente ");
            System.out.println("Digite aqui sua opção: ");
            int opcao2 = Integer.parseInt(sc.nextLine());
            
            Funcionario escolhido = null;
            
            if(opcao2==1){
                System.out.println("Voce selecionou Programador");
                escolhido = p;
            }else{
                 System.out.println("Voce selecionou gerente");
                escolhido = g;
            }

            if (opcao == 1) {              
              
                System.out.println(escolhido.getNome());
                System.out.println(escolhido.getSalario());
            }
             if (opcao == 2) {       
                 escolhido.aumentaSalario();
                 
             }

        } while (true);

    }

}
