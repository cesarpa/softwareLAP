/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sucorrientazoadomicilio.pedidoslap.logic;

import co.com.sucorrientazoadomicilio.pedidoslap.logic.dto.PedidoDTO;

/**
 *
 * @author cesar.palacios
 */
public interface IPedidoLogic {
    public void guardarPedido(PedidoDTO pedido) throws Exception;
}
