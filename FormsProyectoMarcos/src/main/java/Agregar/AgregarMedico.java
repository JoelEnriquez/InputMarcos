/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregar;

import SQL.AuxInsertar;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        String codigo = auxInsertar.getCodigoMedicoInsertar();
        String nombre = request.getParameter("nombre");
        int noColegiado = Integer.parseInt(request.getParameter("colegiado"));
        String DPI = request.getParameter("DPI");
        int noTelefono = Integer.parseInt(request.getParameter("telefono"));
        String correo = request.getParameter("correo");
        Date fechaInicio = Date.valueOf(request.getParameter("fecha_inicio"));

        String hInicio = request.getParameter("hora_inicio");
        String hFin = request.getParameter("hora_fin");
        Time horaInicio;
        Time horaFin;

        try {
            java.util.Date dateAuxTimeInicio = (java.util.Date) format.parse(hInicio);
            horaInicio = new Time(dateAuxTimeInicio.getTime());
            
            java.util.Date dateAuxTimeFin = (java.util.Date) format.parse(hFin);
            horaFin = new Time(dateAuxTimeFin.getTime());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        //Mandas a insertar el medico
    }

}
