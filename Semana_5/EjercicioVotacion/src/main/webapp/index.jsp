<%@page import="java.util.List"%>
<%@page import="com.ejercicios.ejerciciovotacion.logica.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votación</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h1>Votación</h1>
            <p>Elija su voto: </p>
            <form action="VotacionSV" method="post">
                <div class="form-group">
                    <input type="radio" id="partidoa" name="votacion" value="partidoa">
                    <label for="partidoa">Partido A</label>
                </div>
                <div class="form-group">
                     <input type="radio" id="partidob" name="votacion" value="partidob">
                     <label for="partidob">Partido B</label>
                </div>
                <div class="form-group">
                    <input type="radio" id="partidoc" name="votacion" value="partidoc">
                    <label for="partidoc">Partido C</label>
                </div>
                
                <button type="submit" class="btn btn-primary">Votar</button>
            </form>
        </div>
        <div class="container mt-4">
            <form action="VotacionSV" method="get">
                <button type="submit" class="btn btn-success">Mostrar resultados</button>
            </form>
        </div>
        <div class="container mt-4">
            <% if (request.getAttribute("partidos") != null) { %>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad Votos</th>                          
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) { %>
                            <tr>
                                <td><%=partido.getNombre()%></td>
                                <td><%=partido.getVotos() %></td>
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
