package org.egov.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains the ResponseHeader and the enriched tenant information
 */
@ApiModel(description = "Contains the ResponseHeader and the enriched tenant information")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2021-08-02T16:24:12.742+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GovernmentResponse {
    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("government")
    @Valid
    private List<Government> government = null;


    public GovernmentResponse addGovernmentItem(Government governmentItem) {
        if (this.government == null) {
            this.government = new ArrayList<>();
        }
        this.government.add(governmentItem);
        return this;
    }

}

