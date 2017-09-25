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
public class Mulher extends  PessoaIMC{

    public Mulher(double peso, double altura, String nome, String dataNascimento) {
        super(peso, altura, nome, dataNascimento);
    }
    
    public String resultIMC() {

        double imc = calculaIMC(getPeso(), getAltura());

        String s = "";
        s+="imc:"+imc;
        
        if (imc < 19 ) {
            s += " \nAbaixo do peso ideal ";
        }
        if (19  < imc && imc < 25.8) {
            s += "\nPeso ideal";
        } else if (imc >  25.8) {
            s += "\nAcima do peso ideal ";
        }

        return s;

    }
    
    
}
