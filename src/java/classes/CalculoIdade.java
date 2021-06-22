/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author thiagosilva
 */
public class CalculoIdade  implements ICalculoIdade {
	private int ANO_CORRENTE = 2021;
	private int anoNascPaciente;
	
	public int getAnoNascPaciente() {
		return anoNascPaciente;
	}
	public void setAnoNascPaciente(int anoNascPaciente) {
		this.anoNascPaciente = anoNascPaciente;
	}

    

        
	public int getIdadePaciente() {
		return ANO_CORRENTE - anoNascPaciente;
	}
}
