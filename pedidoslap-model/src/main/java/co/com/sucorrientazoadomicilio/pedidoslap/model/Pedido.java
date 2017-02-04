/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sucorrientazoadomicilio.pedidoslap.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author cesar.palacios
 */
public class Pedido {

    private Long codigoPedido;
    private Date fechaPedido;
    private String descripcion;
    private List<Ingreso> listaIngresos;
    private List<Egreso> listaEgresos;
    private Integer total;
    private Integer subTotal;

    /**
     * @return the codigoPedido
     */

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

    /**
     * @return the listaIngresos
     */
    public List<Ingreso> getListaIngresos() {
        return listaIngresos;
    }

    /**
     * @param listaIngresos the listaIngresos to set
     */
    public void setListaIngresos(List<Ingreso> listaIngresos) {
        this.listaIngresos = listaIngresos;
    }

    /**
     * @return the listaEgresos
     */
    public List<Egreso> getListaEgresos() {
        return listaEgresos;
    }

    /**
     * @param listaEgresos the listaEgresos to set
     */
    public void setListaEgresos(List<Egreso> listaEgresos) {
        this.listaEgresos = listaEgresos;
    }

    /**
     * @return the codigoPedido
     */
    public Long getCodigoPedido() {
        return codigoPedido;
    }

    /**
     * @param codigoPedido the codigoPedido to set
     */
    public void setCodigoPedido(Long codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    /**
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return the subTotal
     */
    public Integer getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the fechaPedido
     */
    public Date getFechaPedido() {
        return fechaPedido;
    }

    /**
     * @param fechaPedido the fechaPedido to set
     */
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /**
     * @return the totalDiferencia
     */
}
