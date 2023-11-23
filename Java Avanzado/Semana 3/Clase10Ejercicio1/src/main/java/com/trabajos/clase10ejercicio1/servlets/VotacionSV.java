package com.trabajos.clase10ejercicio1.servlets;

import com.trabajos.clase10ejercicio1.logic.Controladora;
import com.trabajos.clase10ejercicio1.logic.Voto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VotacionSV", urlPatterns = {"/VotacionSV"})
public class VotacionSV extends HttpServlet {

    Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VotacionSV</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VotacionSV at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);

        List<Voto> votos = controladora.traerVotos();
        request.setAttribute("resultados", votos);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);

        String voto = request.getParameter("radio");
        try {
            controladora.añadirVoto(voto);
        } catch (Exception ex) {
            Logger.getLogger(VotacionSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("------------------------" + voto);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
