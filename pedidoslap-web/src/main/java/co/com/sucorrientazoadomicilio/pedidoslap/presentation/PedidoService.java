/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sucorrientazoadomicilio.pedidoslap.presentation;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author CESARPA
 */
@Stateless
@ApplicationPath("/resources")
@Path("pedidos")
public class PedidoService extends Application {

    private List<String> listaStrings;

    private void llenarPersonas() {
        listaStrings = new ArrayList<>();
        listaStrings.add("CESAR");
        listaStrings.add("ANDRES");
        listaStrings.add("PALACIOS");
        listaStrings.add("HERNANDEZ");
    }

    public PaginatedListWrapper<String> findPersons(PaginatedListWrapper<String> wrapper) {
        llenarPersonas();
        wrapper.setTotalResults(listaStrings.size());
        int start = (wrapper.getCurrentPage() - 1) * wrapper.getPageSize();
        wrapper.setList(listaStrings);
        return wrapper;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PaginatedListWrapper<String> listPersons(@DefaultValue("1")
            @QueryParam("page") Integer page,
            @DefaultValue("id")
            @QueryParam("sortFields") String sortFields,
            @DefaultValue("asc")
            @QueryParam("sortDirections") String sortDirections) {
        PaginatedListWrapper<String> paginatedListWrapper = new PaginatedListWrapper<>();
        paginatedListWrapper.setCurrentPage(page);
        paginatedListWrapper.setSortFields(sortFields);
        paginatedListWrapper.setSortDirections(sortDirections);
        paginatedListWrapper.setPageSize(5);
        return findPersons(paginatedListWrapper);
    }

}
