package com.tepach.bd;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBD {

    private final String user;
    private final String pass;
    private String server;
    private final String DB;
    private final String DriverMySQL;
    private Connection con;
    protected ResultSet Rs;
    protected CallableStatement Cst;
    protected Statement St;
    protected PreparedStatement Pst;

    public ConexionBD() {
        this.user = "anthonytepach";
        this.pass = "Tbryan.1996";
        this.server = "jdbc:mysql://192.168.1.166:3306/";
        this.DB = "cf_escaneo";
        this.DriverMySQL = "com.mysql.jdbc.Driver";
        this.con = null;

    }
     public ConexionBD(String usuario,String contrasenia) {
        this.user = usuario;
        this.pass = contrasenia;
        this.server = "jdbc:mysql://localhost/";
        this.DB = "GASORED";
        this.DriverMySQL = "com.mysql.jdbc.Driver";
        this.con = null;

    }

    public Connection OpenDB() {
        try {
            Class.forName(DriverMySQL);
            con = DriverManager.getConnection(server + DB, user, pass);
            
        } catch (ClassNotFoundException ex) {
            //System.out.println("No se a podido localizar el Driver: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            con = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            con = null;
        }
        return con;
    }

    public void CloseDB() {
        try {
            if (this.Cst != null) {
                this.Cst.close();
                //System.out.println("CST Cerrada");
            }
            if (this.Pst != null) {
                this.Pst.close();
                //System.out.println("PST Cerrada");
            }
            if (this.Rs != null) {
                this.Rs.close();
                //System.out.println("RS Cerrada");
            }
            if (this.St != null) {
                this.St.close();
                //System.out.println("ST Cerrada");
            }
            if (this.con != null) {
                this.con.close();
                //System.out.println("CON cerrada");
            }

        } catch (SQLException sqle) {
            System.out.println("Error al cerra las conexiones: " + sqle.getMessage());
        }
    }
}
