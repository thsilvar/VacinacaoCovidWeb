/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.CalculoIdade;
/**
 *
 * @author thiagosilva
 */
public class VacinacaoCovidController {
    
    static CalculoIdade objCalculoIdade;
    public VacinacaoCovidController() {
    }

    public boolean Instancia(int idade){
        try{
            this.objCalculoIdade = new CalculoIdade();
            objCalculoIdade.setAnoNascPaciente(idade);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public int Calcular(){
       
        return objCalculoIdade.getIdadePaciente();
    }

  

  
}
