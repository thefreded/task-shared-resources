package com.freded.dtos;

import com.freded.dtos.interfaces.Sortable;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Base DTO for sorting parameters. Contains sorting field and order information.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SortingDTO implements Sortable {
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
