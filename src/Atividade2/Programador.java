/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

/**
 *
 * @author estagiario
 */
public class Programador extends Funcionario{
    
    public void aumentaSalario(){
        setSalario(getSalario()+(getSalario()*0.2));
    }
}
