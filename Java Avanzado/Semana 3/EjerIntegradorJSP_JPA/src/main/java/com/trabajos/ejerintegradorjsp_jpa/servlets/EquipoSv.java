package com.trabajos.ejerintegradorjsp_jpa.servlets;

import com.trabajos.ejerintegradorjsp_jpa.logic.Controladora;
import com.trabajos.ejerintegradorjsp_jpa.logic.Equipo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rober
 */
@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {

    Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EquipoSv</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EquipoSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);

        List<Equipo> equipos = controladora.mostrarEquipos();
        equipos.forEach(e -> System.out.println(e.toString()));

        request.setAttribute("resultados", equipos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //processRequest(request, response);
        String nombre = request.getParameter("nombre");
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        controladora.añadirEquipo(equipo);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
