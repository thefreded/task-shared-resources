package com.freded.dtos.interfaces;


/**
 * Interface defining sorting contract.
 */
public interface Sortable {
    String getSortBy();

    void setSortBy(String sortBy);

    String getSortOrder();

    void setSortOrder(String sortOrder);
}
