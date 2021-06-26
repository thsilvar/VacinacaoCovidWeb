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
import static org.easymock.EasyMock.*;

public class VacinacaoMockTest extends TestCase {
    
        public void testeVacina_NaoExistente(){
           	  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(-1);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Idade Invalida", vacinacao.Previsao(idadeMock));
	  }
	
	public void testVacinacao_idadeMinima() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(15);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não consta no calendario de vacinação.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade20Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(20);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Setembro de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade25Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(25);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade30Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(30);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade35Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(35);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Julho de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade40Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(40);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade45Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(45);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade50Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(50);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade55Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(55);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idade60Anos() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(60);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você ainda não pode se vacinar. Previsão para vacinação a partir do Dia 28 de Abril de 2021.", vacinacao.Previsao(idadeMock));
	  }

	  public void testVacinacao_idadeJaLiberada() {
		  ICalculoIdade idadeMock = createMock(ICalculoIdade.class);
		  expect(idadeMock.getIdadePaciente()).andReturn(61);
		  replay(idadeMock);
		  
		  Vacinacao vacinacao = new Vacinacao();
		  assertEquals("Você pode se vacinar, procure o Posto de Saúde mais próximo.", vacinacao.Previsao(idadeMock));
	  }
	}
