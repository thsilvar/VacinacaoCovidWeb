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

import junit.framework.TestCase;

public class VacinacaoTest extends TestCase {

  Vacinacao vacinacao;
  CalculoIdade calculoIdade;

  @Override
  protected void setUp() throws Exception {
    vacinacao = new Vacinacao();
    calculoIdade = new CalculoIdade();
  }

  public void testVacinacao_idadeMinima() {
	  calculoIdade.setAnoNascPaciente(2006);
    assertEquals("Você ainda não consta no calendario de vacinação.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade20Anos() {
    calculoIdade.setAnoNascPaciente(2001);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Setembro de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade25Anos() {
	  calculoIdade.setAnoNascPaciente(1996);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade30Anos() {
	  calculoIdade.setAnoNascPaciente(1991);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade35Anos() {
	  calculoIdade.setAnoNascPaciente(1986);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Julho de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade40Anos() {
	  calculoIdade.setAnoNascPaciente(1981);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade45Anos() {
	  calculoIdade.setAnoNascPaciente(1976);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade50Anos() {
	  calculoIdade.setAnoNascPaciente(1971);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade55Anos() {
	  calculoIdade.setAnoNascPaciente(1966);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idade60Anos() {
	  calculoIdade.setAnoNascPaciente(1961);
    assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir do Dia 28 de Abril de 2021.", vacinacao.Previsao(calculoIdade));
  }

  public void testVacinacao_idadeJaLiberada() {
	  calculoIdade.setAnoNascPaciente(1956);
    assertEquals("Você pode se vacinar, procure o Posto de Saúde mais próximo.", vacinacao.Previsao(calculoIdade));
  }
}
