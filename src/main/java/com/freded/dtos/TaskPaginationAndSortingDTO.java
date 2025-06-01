package com.freded.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * DTO for Task pagination and sorting with specific default sorting field.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class TaskPaginationAndSortingDTO extends PaginationAndSortingDTO {


}
