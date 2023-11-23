<%-- 
    Document   : index
    Created on : 22 nov 2023, 17:02:46
    Author     : roibaldomir
--%>

<%@page import="com.bootcamp.ejerciciointegrador.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bootcamp.ejerciciointegrador.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Torneo baloncesto</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h1 class="pb-4">Registro de equipos</h1>
            <form action="EquipoSV" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="apellido">Procedencia:</label>
                    <input type="text" class="form-control" id="procedencia" name="procedencia">
                </div>
               
                <button type="submit" class="btn btn-primary">Registrar equipo</button>
            </form>
        </div>
        
        <div class="container mt-4">
            <h1 class="pb-4 pt-4">Equipos registrados</h1>
            <form action="EquipoSV" method="get"> 
                <button type="submit" class="btn btn-primary">Lista equipos</button>
            </form>
        </div>
        
        <div class="container mt-4">
            <% if (request.getAttribute("equiposRegistrados") != null) { %>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Procedencia</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("equiposRegistrados")) { %>
                            <tr>
                                <td><%= equipo.getId()%></td>
                                <td><%= equipo.getNombre()%></td>
                                <td><%= equipo.getProcedencia()%></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
        
        <div class="container mt-4">
            <h1 class="pb-4 pt-4">Registro de partidos</h1>
            <form action="PartidoSV" method="post">
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" id="fecha" name="fecha">
                </div>
                <div class="form-group">
                    <label for="equipo1">Equipo 1 (ID):</label>
                    <input type="number" class="form-control" id="equipo1" name="equipo1">
                </div>
                <div class="form-group">
                    <label for="equipo2">Equipo 2 (ID):</label>
                    <input type="number" class="form-control" id="equipo2" name="equipo2">
                </div>
                <div class="form-group">
                    <label for="resultado1">Resultado equipo 1:</label>
                    <input type="number" class="form-control" id="resultado1" name="resultado1">
                </div>
                <div class="form-group">
                    <label for="resultado2">Resultado equipo 2:</label>
                    <input type="number" class="form-control" id="resultado2" name="resultado2">
                </div>
               
                <button type="submit" class="btn btn-primary">Registrar partido</button>
            </form>
        </div>
        
        <div class="container mt-4">
            <h1 class="pb-4 pt-4">Partidos registrados</h1>
            <form action="PartidoSV" method="get"> 
                <button type="submit" class="btn btn-primary">Lista partidos</button>
            </form>
        </div>
        
        <div class="container mt-4">
            <% if (request.getAttribute("partidos") != null) { %>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Equipo Local</th>
                            <th>Equipo Visitante</th>
                            <th>Resultado Local</th>
                            <th>Resultado Visitante</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) { %>
                            <tr>
                                <td><%=partido.getFechaFormateada() %></td>
                                <td><%=partido.getEquipo1().getNombre() %></td>
                                <td><%=partido.getEquipo2().getNombre() %></td>
                                <td><%=partido.getResultadoLocal() %></td>
                                <td><%=partido.getResultadoVisitante() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
       
        
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>        
    </body>
</html>
