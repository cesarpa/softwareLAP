/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sucorrientazoadomicilio.pedidoslap.model;

/**
 *
 * @author cesar.palacios
 */
public class Egreso {
    private Integer codigoEgreso;
    private String descripcion;

    /**
     * @return the codigoEgreso
     */
    public Integer getCodigoEgreso() {
        return codigoEgreso;
    }

    /**
     * @param codigoEgreso the codigoEgreso to set
     */
    public void setCodigoEgreso(Integer codigoEgreso) {
        this.codigoEgreso = codigoEgreso;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
