/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.modelo;

import com.tepach.bd.ConexionBD;
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
}
