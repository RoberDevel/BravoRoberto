<%--
    Document   : index
    Created on : 22 nov 2023, 17:01:34
    Author     : rober
--%>

<%@page import="com.trabajos.ejerintegradorjsp_jpa.logic.Partido"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.trabajos.ejerintegradorjsp_jpa.logic.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Torneo Baloncesto</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <h2>Añade un equipo</h2>
        <form action="EquipoSv" method="POST">
            <label for="nombre">Nombre:</label>
            <input type="text" class="form-control" id="nombre1" name="nombre">
            <br>
            <button type="submit" class="btn btn-primary">Enviar</button>

        </form>
        <br>
        <form action="EquipoSv" method="GET" accept-charset="UTF-8">
            <!-- <input type="text" class="form-control" id="consultaApellido" name="consultaApellido"> -->
            <button type="submit" class="btn btn-primary">Mostrar equipos</button>
        </form>
        <div>
            <% if (request.getAttribute("resultados") != null) { %>
            <h3>Resultados:</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nombre</th>

                    </tr>
                </thead>
                <tbody>
                    <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) {%>
                    <tr>
                        <td><%= equipo.getNombre()%></td>

                    </tr>
                    <% } %>
                </tbody>
            </table>
            <% }%>

        </div>
        <br>

        <h2>Añade un partido</h2>


        <form action="PartidoSv" method="POST">

            <label for="fecha">Fecha:</label>
            <input type="date" class="form-control" id="fecha" name="fecha"><br>
            <label for="equipoLocal">Id equipo Local:</label>
            <input type="number" class="form-control" id="nombre1" name="nombre1"><br>
            <label for="equipoVisitante">Id equipo Visitante:</label>
            <input type="number" class="form-control" id="nombre2" name="nombre2"><br>
            <label for="puntosEq1">Puntos equipo 1:</label>
            <input type="number" class="form-control" id="puntos1" name="puntos1"><br>
            <label for="puntosEq2">Puntos equipo 2:</label>
            <input type="number" class="form-control" id="puntos2" name="puntos2">
            <br>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        <form action="PartidoSv" method="GET" accept-charset="UTF-8">
            <!-- <input type="text" class="form-control" id="consultaApellido" name="consultaApellido"> -->
            <br>
            <button type="submit" class="btn btn-primary">Mostrar partidos</button>
        </form>

        <div>
            <% if (request.getAttribute("resultado") != null) { %>
            <h3>Resultados:</h3>
            <table class="table" >
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Equipo Local</th>
                        <th>Equipo Visitante</th>
                        <th>Puntos Local</th>
                        <th>Puntos Visitante</th>

                    </tr>
                </thead>
                <tbody>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("resultado")) {%>
                    <tr>
                        <td><%= partido.getFecha()%></td>
                        <td><%= partido.getEquipo1().getNombre()%></td>
                        <td><%= partido.getEquipo2().getNombre()%></td>
                        <td><%= partido.getResultado1()%></td>
                        <td><%= partido.getResultado2()%></td>

                    </tr>
                    <% } %>
                </tbody>
            </table>
            <% }%>

        </div>


        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
