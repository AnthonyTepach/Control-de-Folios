/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.modelo;

import com.tepach.bd.ConexionBD;
import com.tepach.controlador.C_random;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author inspector
 */
public class M_Usuario extends ConexionBD {

    public ResultSet GetU(GetSet gs) {
        Rs = null;
        try {
            Pst = OpenDB().prepareStatement("SELECT * FROM cf_usuarios WHERE nom_user = ? AND contrasenia_usu = ?");
            Pst.setString(1, gs.getUser());
            Pst.setString(2, gs.getPass());
            Rs = Pst.executeQuery();
        } catch (SQLException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getSQLState(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            Rs = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
        return Rs;
    }

    public void NuevoUsusario(GetSet gs) {
        C_random cr = new C_random();
        try {
            Pst = OpenDB().prepareStatement("INSERT INTO cf_usuarios VALUES(?,?,?,?)");
            Pst.setString(1, gs.getId());
            Pst.setString(2, gs.getUser());
            Pst.setString(3, cr.convertirSHA256(gs.getId()));
            Pst.setString(4, gs.getTipo());
            int resp = Pst.executeUpdate();
            if (resp > 0) {
                CloseDB();
                JOptionPane.showMessageDialog(null, "Guardado", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            String msj = "SQL";
            if (ex.getMessage().contains("Duplicate entry")) {
                msj = "de Duplicidad";
            } else if (ex.getMessage().contains("data too long")) {
                msj = "nombre del cliente muy largo";
            }
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error " + msj, JOptionPane.ERROR_MESSAGE);
        }
    }
    public ResultSet getall() {
    try {
      Rs = null;
      Pst = OpenDB().prepareStatement("SELECT * FROM cf_usuarios");
      Rs = Pst.executeQuery();

    }
    catch (SQLException ex)
    {
      JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", 0);
          
    }
   
    return Rs;
    
  }
      public ResultSet getusuario(GetSet gs) {
    try {
      Rs = null;
      Pst = OpenDB().prepareStatement("SELECT * FROM cf_usuarios WHERE nom_user = ?");
      Pst.setString(1, gs.getUser());
      Rs = Pst.executeQuery();
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", 0);
    }
    return Rs;
  }
    public static void main(String[] args) {
        GetSet a=new GetSet();
        a.setId(a.crearUUID());
        a.setUser("Jose");
        a.setTipo("opera");
        new M_Usuario().NuevoUsusario(a);
    }
}
