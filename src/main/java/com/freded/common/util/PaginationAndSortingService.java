package com.freded.common.util;


import com.freded.common.dto.PaginationAndSortingDTO;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Order;
import jakarta.persistence.criteria.Root;

public final class PaginationAndSortingService {

    private static final String DESC = "DESC";
    
    private PaginationAndSortingService() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Applies sorting to a CriteriaQuery based on sorting parameters.
     *
     * @param cb      The CriteriaBuilder for constructing sort expressions.
     * @param cbQuery The CriteriaQuery to apply sorting to.
     * @param root    The root entity being queried.
     * @param qParams The sorting parameters (must extend PaginationAndSortingDTO).
     * @param <T>     The type of the entity being queried.
     * @param <Q>     The type of the sorting DTO.
     */
    public static <T, Q extends PaginationAndSortingDTO> void sort(final CriteriaBuilder cb,
            final CriteriaQuery<T> cbQuery, final Root<T> root, final Q qParams) {

        Order order = DESC.equalsIgnoreCase(qParams.getSortOrder()) ? cb.desc(root.get(qParams.getSortBy())) :
                cb.asc(root.get(qParams.getSortBy()));

        cbQuery.orderBy(order);
    }

    /**
     * Applies pagination to a TypedQuery based on the provided parameters.
     *
     * @param typedQuery The TypedQuery to apply pagination to.
     * @param qParams    The pagination parameters.
     * @param <T>        The type of the entity being queried.
     * @param <Q>        The type of the pagination DTO.
     */
    public static <T, Q extends PaginationAndSortingDTO> void paginate(final TypedQuery<T> typedQuery,
            final Q qParams) {

        typedQuery.setFirstResult(qParams.getOffset());
        typedQuery.setMaxResults(qParams.getLimit());
    }
}

