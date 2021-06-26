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
public class Vacinacao {
	public int IDADE_MINIMA = 16;
	public int IDADE_20_ANOS = 20;
	public int IDADE_25_ANOS = 25;
	public int IDADE_30_ANOS = 30;
	public int IDADE_35_ANOS = 35;
	public int IDADE_40_ANOS = 40;
	public int IDADE_45_ANOS = 45;
	public int IDADE_50_ANOS = 50;
	public int IDADE_55_ANOS = 55;
	public int IDADE_60_ANOS = 60;
        


	public String Previsao(ICalculoIdade idadePaciente) {
            
            
		
		int idade = idadePaciente.getIdadePaciente() ;

                if(idade<=0){
                    throw new IllegalArgumentException("Idade Invalida");
                }
                
		if (idade < IDADE_MINIMA) {                                                                                      
			return "Você ainda não consta no calendario de vacinação.";													 //2
		} else if (idade <= IDADE_20_ANOS) {                                                                            
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Setembro de 2021.";				 
		} else if (idade <= IDADE_25_ANOS) {																			 //5
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.";				 
		} else if (idade <= IDADE_30_ANOS) {																			 //7
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.";				
		} else if (idade <= IDADE_35_ANOS) {																			 //9
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Julho de 2021.";				
		} else if (idade <= IDADE_40_ANOS) {																			 //11
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.";				
		} else if (idade <= IDADE_45_ANOS) {																			 //13
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.";				
		} else if (idade <= IDADE_50_ANOS) {																			 //15
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.";					 
		} else if (idade <= IDADE_55_ANOS) {																			 //17
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.";					
		} else if (idade <= IDADE_60_ANOS) {																			 //19
			return "Você ainda não pode se vacinar. Previsão para vacinação a partir do Dia 28 de Abril de 2021.";		 
		} else {
			return "Você pode se vacinar, procure o Posto de Saúde mais próximo.";                                     
		}
	}																													 //22
}
