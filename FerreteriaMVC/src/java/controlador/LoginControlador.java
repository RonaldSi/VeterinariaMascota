 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 *
 * @author RONALD SILVA GUTIERR
 */
@WebServlet({"/LoginAcceso","/Salir"})
public class LoginControlador extends HttpServlet {

    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getServletPath();
        if(nombre.equals("/LoginAcceso")){
          ingresar(request,response);
              
        }else if(nombre.equals("/Salir")){
          salir(request,response);
        }
        
        }
    
    
        protected void ingresar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            
            String usuario = request.getParameter("user");
            String clave = request.getParameter("password");
            String destino;
            
            if(usuario.equals("ronald")&&clave.equals("123")){
                  //Acceder
                  destino = "principal.jsp";
                  HttpSession session = request.getSession(true);
                  session.setAttribute("texto","Bienvenido");
            }else{
                  //Rechazar
                  destino="login.jsp";
                  HttpSession session =request.getSession(true);
                  session.setAttribute("texto", "Error");
            }
            RequestDispatcher rd;
            rd = request.getRequestDispatcher(destino);
            rd.forward(request, response);
        }
         
        
        protected void salir(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("Login.jsp");
                    

}

}