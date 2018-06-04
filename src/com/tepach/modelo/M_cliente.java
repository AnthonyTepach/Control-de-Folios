/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.modelo;

import com.tepach.bd.ConexionBD;
import java.awt.HeadlessException;
import java.sql.Date;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;

/**
 *
 * @author inspector
 */
public class M_cliente extends ConexionBD {

    public ResultSet getClientes() {
        Rs = null;
        try {
            Pst = OpenDB().prepareCall("SELECT nom_cliente,fecha_registro,hora_registro,nom_user FROM cf_cliente NATURAL JOIN cf_usuarios ORDER BY fecha_registro,hora_registro ASC");
            Rs = Pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            Rs = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            Rs = null;
        }
        return Rs;
    }
    //solo recupera C_nombre y  id de la clase GetSet
    public void setCliente(GetSet gs) {
        java.util.Date fechaActual = new java.util.Date(); //Fecha actual del sistema
        try {
            Pst = OpenDB().prepareCall("INSERT INTO cf_cliente VALUES(?,?,?,?,?)");
            Pst.setString(1, gs.crearUUID());
            Pst.setString(2, gs.getC_nombre());
            Pst.setDate(3,new Date(fechaActual.getTime()));
            Pst.setTime(4, new Time(fechaActual.getTime()));
            Pst.setString(5, gs.getId());
            int resp = Pst.executeUpdate();
            if (resp > 0) {
                CloseDB();
                JOptionPane.showMessageDialog(null, "Guardado", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            String msj="SQL";
            if (ex.getMessage().contains("Duplicate entry")) {
                msj="de Duplicidad";
            }else if(ex.getMessage().contains("data too long")){
                msj="nombre del cliente muy largo";
            }
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error "+msj, JOptionPane.ERROR_MESSAGE);
        } 
       
    }

    
}
