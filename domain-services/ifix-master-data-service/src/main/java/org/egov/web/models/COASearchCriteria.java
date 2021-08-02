package org.egov.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * The object contains all the search criteria of the fund
 */
@ApiModel(description = "The object contains all the search criteria of the fund")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2021-08-02T16:24:12.742+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class COASearchCriteria {
    @JsonProperty("Ids")
    @Valid
    private List<String> ids = null;

    @JsonProperty("tenantId")
    private String tenantId = null;

    @JsonProperty("majorHead")
    private String majorHead = null;

    @JsonProperty("subMajorHead")
    private String subMajorHead = null;

    @JsonProperty("minorHead")
    private String minorHead = null;

    @JsonProperty("subHead")
    private String subHead = null;

    @JsonProperty("groupHead")
    private String groupHead = null;

    @JsonProperty("objectHead")
    private String objectHead = null;


    public COASearchCriteria addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

}

