package com.freded.dtos.interfaces;


/**
 * Interface defining pagination contract.
 */
public interface Pageable {
    int getOffset();

    void setOffset(int offset);

    int getLimit();

    void setLimit(int limit);
}
