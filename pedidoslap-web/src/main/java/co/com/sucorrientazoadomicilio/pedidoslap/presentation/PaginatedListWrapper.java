/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sucorrientazoadomicilio.pedidoslap.presentation;

import java.util.List;

/**
 *
 * @author CESARPA
 */
public class PaginatedListWrapper<T> {

    private Integer currentPage;
    private Integer pageSize;
    private Integer totalResults;

    private String sortFields;
    private String sortDirections;
    private List<T> list;

    /**
     * @return the currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage the currentPage to set
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * @return the pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * @param totalResults the totalResults to set
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * @return the sortFields
     */
    public String getSortFields() {
        return sortFields;
    }

    /**
     * @param sortFields the sortFields to set
     */
    public void setSortFields(String sortFields) {
        this.sortFields = sortFields;
    }

    /**
     * @return the sortDirections
     */
    public String getSortDirections() {
        return sortDirections;
    }

    /**
     * @param sortDirections the sortDirections to set
     */
    public void setSortDirections(String sortDirections) {
        this.sortDirections = sortDirections;
    }

    /**
     * @return the list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<T> list) {
        this.list = list;
    }
}
