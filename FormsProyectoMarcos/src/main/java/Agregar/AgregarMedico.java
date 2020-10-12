/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregar;

import SQL.AuxInsertar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joel Enriquez
 */
@WebServlet(name = "AgregarMedico", urlPatterns = {"/AgregarMedico"})
public class AgregarMedico extends HttpServlet {

    private AuxInsertar auxInsertar = new AuxInsertar();
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String codigo = auxInsertar.getCodigoMedicoInsertar();
        String nombre = request.getParameter("nombre");
        
        //Mandas a insertar el medico
      
    }

    

}
