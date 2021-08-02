package org.egov.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains the ResponseHeader and the enriched Department information
 */
@ApiModel(description = "Contains the ResponseHeader and the enriched Department information")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2021-08-02T16:24:12.742+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentResponse {
    @JsonProperty("responseInfo")
    private ResponseHeader responseInfo = null;

    @JsonProperty("department")
    @Valid
    private List<ChartOfAccount> department = null;


    public DepartmentResponse addDepartmentItem(ChartOfAccount departmentItem) {
        if (this.department == null) {
            this.department = new ArrayList<>();
        }
        this.department.add(departmentItem);
        return this;
    }

}

