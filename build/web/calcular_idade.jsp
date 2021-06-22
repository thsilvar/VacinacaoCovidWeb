<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Idade Para Vacinar</title>
    </head>
    <body>
        <font face="tahoma">
            <h1>Calcular </h1>
            <form action="ServletControllerWeb" method="post" name="frmCalculoIdade" onsubmit="return validaFormularioCadastro()">
                <table>
                        <tr>
                        <td>Ano de Nascimento:</td><td><input type="text" name="vIdade" size="40"></td>
                    </tr>     
                                      
                    <tr>
                        <INPUT size="3" type="Hidden" name="vOP" value="0">
                        <td></td><td><input type="submit" name="Enviar" value="Enviar"></td>
                    </tr>               
                </table>
            </form>
            <br><br> <br><a href="index.jsp" >Voltar</a><br>
        </font>
        <SCRIPT language="JavaScript">
            <!--
    
            function validaFormularioCadastro() { 
                frm = document.frmCalculoIdade;
                var vMensagem;
                var vInconsistente;
                var vRequeridos;
                vMensagem = "";
                vRequeridos = 0;
                                           
                       if (frm.vIdade.value == ""){
                    vMensagem = "Informe a idade da pessoa.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vIdade.focus();
                }            
                          
                if (vRequeridos == 1){
                    vMensagem = ""+vMensagem;
                }
                
                if (vMensagem == ""){
                    return true;
                }else{
                    alert(vMensagem);
                    return false;
                }                
            } 
    
    
            //-->
        </SCRIPT>        
    </body>
</html>