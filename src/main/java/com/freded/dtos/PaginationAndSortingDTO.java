package com.freded.dtos;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * DTO combining pagination and sorting functionality. Contains parameters to control the offset, limit, sorting field,
 * and sorting order.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationAndSortingDTO {
    /**
     * The starting point of the data to be sent as result. Default is 0.
     */
    @QueryParam("offset")
    @DefaultValue("0")
    private int offset;

    /**
     * Maximum number of data to be sent as result. Default is 10.
     */
    @QueryParam("limit")
    @DefaultValue("10")
    private int limit;

    /**
     * Field that should be used as sorting value. Default is {@code createdAt}.
     */
    @QueryParam("sortBy")
    @DefaultValue("createdAt")
    private String sortBy;

    /**
     * Field to be used as sorting order. Can be either ascending {@code asc} or descending {@code desc} Default is
     * {@code asc}.
     */
    @QueryParam("sortOrder")
    @DefaultValue("asc")
    private String sortOrder;
}
