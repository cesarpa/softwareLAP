/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sucorrientazoadomicilio.pedidoslap.logic.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author cesar.palacios
 */
public class PedidoDTO {
     private Long codigoPedido;
    private Date fechaPedido;
    private String descripcion;
    private List<IngresoDTO> listaIngresos;
    private List<EgresoDTO> listaEgresos;
    private Integer total;
    private Integer subTotal;
}
