<%--
Un grupo estudiantil desea llevar a cabo un sistema sencillo para las votaciones del centro de estudiantes de su colegio.
Para ello, necesitan el desarrollo de una aplicación Java que cuente con las siguientes características:

Una página JSP donde se puedan realizar las siguientes acciones:

Desplegar 3 opciones de votos mediante RadioButton junto con un botón "Votar".
Cada alumno debe ser capaz de seleccionar a qué partido quiere votar y al hacer click en votar
se debe guardar el voto en una base de datos.

Mostrar, mediante la presión de un botón "Mostrar resultados" en una tabla,
la cantidad total de votos de cada uno de los candidatos hasta el momento.
Al apretar el botón Mostrar resultados, debajo se deberá desplegar una tabla con los resultados de cada partido,
donde en una columna esté el nombre del partido y en otra la cantidad de votos. Por ejemplo:
--%>

<%@page import="java.util.List"%>
<%@page import="com.trabajos.clase10ejercicio1.logic.Voto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votaciones</title>
        <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
        <h1>Votación</h1>
        <label>Elija su voto:</label>


        <form action="VotacionSV" method="post">

            <input class="form-check-input" type="radio" name="radio" value="a"><label>Partido A</label>
            <br>
            <input class="form-check-input" type="radio" name="radio" value="b"><label>Partido B</label>
            <br>
            <input class="form-check-input" type="radio" name="radio" value="c"><label>Partido C</label>
            <br>
            <br>

            <button type="submit" class="btn btn-primary">Votar</button>
        </form>
        <br>
        <br>
        <form action="VotacionSV" method="get">
            <button type="submit" class="btn btn-success" >Mostrar resultados</button>
        </form>

        <br>
        <br>

        <div class="table">
            <% if (request.getAttribute("resultados") != null) { %>
            <h3>Resultados:</h3>
            <table class="table" border="1">
                <thead class="table-dark">
                    <tr>
                        <th>Partido</th>
                        <th>Cantidad de votos</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Voto voto : (List<Voto>) request.getAttribute("resultados")) {%>
                    <tr>
                        <td> <%= voto.getNombre()%> </td>

                        <td><%= voto.getVoto()%></td>
                    </tr>
                    <% }%>

                </tbody>
            </table>
            <% }%>
        </div>

        <!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> -->

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
