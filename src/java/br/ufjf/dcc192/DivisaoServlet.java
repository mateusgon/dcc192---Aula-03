package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

@WebServlet(name = "DivisaoServlet", urlPatterns = {"/divisao.html"})
public class DivisaoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<tittle>Divisão</tittle>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1< Divisão </h1>");
        out.println("<form method = 'post'>");
        out.println("<label> X: <input name = 'X' /></label>");
        out.println("<label> Y: <input name = 'Y' /></label>");
        out.println("<input type = 'submit' />");
        out.println("<input type = 'reset' />");
        out.println("</body>");
        out.println("</html>");
    
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try 
        {
        Integer X = Integer.valueOf(req.getParameter("X"));
        Integer Y = Integer.valueOf(req.getParameter("Y"));
        
        Integer D = X/Y;
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<tittle>Divisão</tittle>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1< Divisão </h1>");
        out.println("<p> A divisão de X:" +X+ " por Y:" +Y+ " é " +D+ " </p>");
        out.println("</body>");
        out.println("</html>");
        }
        catch (NumberFormatException | ArithmeticException b)
        {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<tittle>Divisão: Erro</tittle>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Divisão: Erro </h1>");
                out.println("<p> Você não passou um número válido </p>");
                out.println("</body>");
                out.println("</html>");
        }
    }

   
    

    
}
