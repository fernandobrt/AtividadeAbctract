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
public abstract class PessoaIMC extends Pessoa{
    
    private double peso, altura;

    public PessoaIMC(double peso, double altura, String nome, String dataNascimento) {
        
        super(nome, dataNascimento);
        
        
        this.peso = peso;
        this.altura = altura;
        
              
    }
    
    public double calculaIMC(double peso, double altura){
        double imc = peso/(altura*altura);
        return imc;
    }
    
    public abstract String resultIMC();
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String s= "";
        s+=" Nome: "+getNome();
        s+=" Data de Nacimento: "+getDataNascimento();
        s+=" Peso: "+getPeso();
        s+=" Altura: "+getAltura();
        
        return s;
    }
    
    
    
    
    
}
