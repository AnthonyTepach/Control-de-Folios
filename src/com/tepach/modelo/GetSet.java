/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.modelo;

import static java.util.UUID.randomUUID;

/**
 *
 * @author inspector
 */
public class GetSet {
    private String user;
    private String pass;
    private String id;
    private String tipo;
    private String c_nombre;
    /**
     * @return the user
     */
    public String crearUUID() {
        return randomUUID().toString().toUpperCase();
    }
    
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the c_nombre
     */
    public String getC_nombre() {
        return c_nombre;
    }

    /**
     * @param c_nombre the c_nombre to set
     */
    public void setC_nombre(String c_nombre) {
        this.c_nombre = c_nombre;
    }
}
