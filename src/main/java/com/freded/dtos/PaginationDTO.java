package com.freded.dtos;

import com.freded.dtos.interfaces.Pageable;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Base DTO for pagination parameters. Contains offset and limit for controlling the data range.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationDTO implements Pageable {

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


}
