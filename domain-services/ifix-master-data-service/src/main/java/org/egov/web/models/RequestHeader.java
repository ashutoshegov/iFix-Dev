package org.egov.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.egov.common.contract.request.UserInfo;
import org.springframework.validation.annotation.Validated;

/**
 * RequestHeader should be used to carry meta information about the requests to the server as described in the fields below. All eGov APIs will use requestHeader as a part of the request body to carry this meta information. Some of this information will be returned back from the server as part of the ResponseHeader in the response body to ensure correlation.
 */
@ApiModel(description = "RequestHeader should be used to carry meta information about the requests to the server as described in the fields below. All eGov APIs will use requestHeader as a part of the request body to carry this meta information. Some of this information will be returned back from the server as part of the ResponseHeader in the response body to ensure correlation.")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2021-08-02T16:24:12.742+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHeader {
    @JsonProperty("ts")
    private Long ts = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("msgId")
    private String msgId = null;

    @JsonProperty("userInfo")
    private UserInfo userInfo = null;

    @JsonProperty("correlationId")
    private String correlationId = null;

    @JsonProperty("signature")
    private String signature = null;


}

