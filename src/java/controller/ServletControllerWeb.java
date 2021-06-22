/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thiagosilva
 */
public class ServletControllerWeb extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String url = "/index.jsp";
        String mensagem = "";

        int idade = Integer.parseInt(request.getParameter("vIdade"));
      
     VacinacaoCovidController objVacinacaoCovidController = new VacinacaoCovidController();
     
     boolean vRetorno = objVacinacaoCovidController.Instancia(idade);
     
       if (!vRetorno) {
            mensagem = "Erro. Objeto n�o Instanciado.";
        } else {
           
           int vCalculo = objVacinacaoCovidController.Calcular();
           
           if (vCalculo < 16) {                                                                                      
			mensagem= "Você ainda não consta no calendario de vacinação.";													 //2
		} else if (vCalculo <= 20) {                                                                            
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Setembro de 2021.";				 
		} else if (vCalculo <= 25) {																			 //5
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.";			 
		} else if (vCalculo <= 30) {																			 //7
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Agosto de 2021.";				
		} else if (vCalculo <= 35) {																			 //9
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Julho de 2021.";				
		} else if (vCalculo <= 40) {																			 //11
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.";				
		} else if (vCalculo <= 45) {																			 //13
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Junho de 2021.";				
		} else if (vCalculo <= 50) {																			 //15
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.";					 
		} else if (vCalculo <= 55) {																			 //17
			mensagem=  "Você ainda não pode se vacinar. Previsão para vacinação a partir de Maio de 2021.";					
		} else if (vCalculo <= 60) {																			 //19
                       mensagem=   "Você ainda não pode se vacinar. Previsão para vacinação a partir do Dia 28 de Abril de 2021.";		 
		} else {
			mensagem=  "Você pode se vacinar, procure o Posto de Saúde mais próximo.";                                     
		}
             request.setAttribute("mensagem", mensagem);

        getServletContext().getRequestDispatcher(url).forward(request, response);      
             
        }
       
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
