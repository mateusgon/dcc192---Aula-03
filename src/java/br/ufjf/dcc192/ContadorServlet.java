package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContadorServlet", urlPatterns = {"/contador.html"})
public class ContadorServlet extends HttpServlet {
    private static int c = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String comando = req.getParameter("comando");
        if("inc".equals(comando))
        {
            c++;
        }
        if("dec".equals(comando))
        {
            c--;
        }
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<tittle>Contador</tittle>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p> Valor de C: " + c + " </p>");
        out.println("<p> <a href='?comando=inc'> Incrementar </a> </p>");
        out.println("<p> <a href='?comando=dec'> Decrementar </a> </p>");
        out.println("</body>");
        out.println("</html>");
    }
    
    
}
