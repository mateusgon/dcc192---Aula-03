package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TodoServlet", urlPatterns = {"/TODO.html"})
public class TodoServlet extends HttpServlet {

    private static List<String> todos = new ArrayList<String>(){{
        add("Estudar Java");
        add("Estudar HTML");
        add("Profit");
    }};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form method='post'>");
        out.println("<label> Atividade: <input name='atividade' /></label>");
        out.println("<input type='submit'>");
        out.println("<input type='reset'>");
        out.println("<p>");
        for (String todo : todos) {
            out.println(todo);
            out.println("</br>");
        }
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String atividade = req.getParameter("atividade");
        todos.add(atividade);
        resp.sendRedirect("TODO.html");
    }
    
    
}
