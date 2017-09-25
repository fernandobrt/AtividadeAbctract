/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author estagiario
 */
public class Homem extends PessoaIMC {

    public Homem(double peso, double altura, String nome, String dataNascimento) {

        super(peso, altura, nome, dataNascimento);
    }

    public String resultIMC() {

        double imc = calculaIMC(getPeso(), getAltura());

        String s = "";
        
        s+="imc:"+imc;

        if (imc < 20.7) {
            s += " \nAbaixo do peso ideal ";
        }
        if (20.7 < imc && imc < 26.4) {
            s += "\nPeso ideal";
        } else if (imc > 26.4) {
            s += "\nAcima do peso ideal ";
        }

        return s;

    }

}
