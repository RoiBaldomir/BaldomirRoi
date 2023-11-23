/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ejercicios.ejerciciovotacion.servlets;

import com.ejercicios.ejerciciovotacion.logica.Controladora;
import com.ejercicios.ejerciciovotacion.logica.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VotacionSV", urlPatterns = {"/VotacionSV"})
public class VotacionSV extends HttpServlet {
    
    Controladora control = new Controladora();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          //Se obtienen los equipos desde la BD
        List<Partido> listaPartidos = control.traerPartidos();
        
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("partidos", listaPartidos);
        
        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response); 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String voto = request.getParameter("votacion");
      
        Partido partido1 = new Partido("Partido A", 0);
        Partido partido2 = new Partido("Partido B", 0);
        Partido partido3 = new Partido("Partido C", 0);
        
        switch (voto) {
            case "partidoa":
                
                if (control.traerPartidoNombre("Partido A") == null) {
                    control.crearPartido(partido1);
                }
                
                int votosA;
                Partido partidoA = control.traerPartidoNombre("Partido A");
                votosA = control.traerPartidoNombre("Partido A").getVotos();
                partidoA.setVotos(votosA + 1);
                control.editarPartido(partidoA);
                break;
                
            case "partidob":
                
                if (control.traerPartidoNombre("Partido B") == null) {
                    control.crearPartido(partido2);
                }
                
                int votosB;
                Partido partidoB = control.traerPartidoNombre("Partido B");
                votosB = control.traerPartidoNombre("Partido B").getVotos();
                partidoB.setVotos(votosB + 1);
                control.editarPartido(partidoB);
                break;
                
            case "partidoc":
                
                if (control.traerPartidoNombre("Partido C") == null) {
                    control.crearPartido(partido3);
                }
                
                int votosC;
                Partido partidoC = control.traerPartidoNombre("Partido C");
                votosC = control.traerPartidoNombre("Partido C").getVotos();
                partidoC.setVotos(votosC + 1);
                control.editarPartido(partidoC);
                break;
                
        }

        response.sendRedirect("index.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
