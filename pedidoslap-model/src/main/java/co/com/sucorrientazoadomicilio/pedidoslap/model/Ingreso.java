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
public class Ingreso {
    private Long codigoIngreso;
    private String descripcion;

    /**
     * @return the codigoIngreso
     */
    public Long getCodigoIngreso() {
        return codigoIngreso;
    }

    /**
     * @param codigoIngreso the codigoIngreso to set
     */
    public void setCodigoIngreso(Long codigoIngreso) {
        this.codigoIngreso = codigoIngreso;
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
