/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.modelo;

import com.tepach.bd.ConexionBD;
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
            Pst = OpenDB().prepareCall("SELECT * FROM cf_cliente");
            Rs = Pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getSQLState(), "Error SQL", JOptionPane.ERROR_MESSAGE);
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
            }else{
                CloseDB();
                JOptionPane.showMessageDialog(null, "No se guardo correctamente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
       
    }

    public static void main(String[] args) {
        GetSet gs = new GetSet();
        gs.setC_nombre("Prueba");
        gs.setId("fa549a02-c47d-425d-bf7c-6f46ee9641a3");
        new M_cliente().setCliente(gs);
    }
}
