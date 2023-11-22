package com.trabajos.ejerintegradorjsp_jpa.servlets;

import com.trabajos.ejerintegradorjsp_jpa.logic.Controladora;
import com.trabajos.ejerintegradorjsp_jpa.logic.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PartidoSv</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PartidoSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);

        List<Partido> partidos = controladora.mostrarPartidos();
        partidos.forEach(e -> System.out.println(e.toString()));

        request.setAttribute("resultado", partidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        String fechaStr = request.getParameter("fecha");

        // Convertir la cadena de fecha a un objeto LocalDate (puedes ajustar el formato según tu HTML)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);
        Long equipo1 = Long.valueOf(request.getParameter("nombre1"));
        Long equipo2 = Long.valueOf(request.getParameter("nombre2"));
        int puntos1 = Integer.parseInt(request.getParameter("puntos1"));
        int puntos2 = Integer.parseInt(request.getParameter("puntos2"));
        Partido partido = new Partido();

        partido.setFecha(fecha);
        partido.setResultado1(puntos1);
        partido.setResultado2(puntos2);
        controladora.añadirPartido(partido, equipo1, equipo2);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
