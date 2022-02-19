
package com.lucid.techrd.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "param_priority",
    "hint",
    "param_description",
    "is_mandatory",
    "default_value",
    "param_name",
    "is_cleartext",
    "param_type"
})
public class GlobalParam {

    @JsonProperty("param_priority")
    public String paramPriority;
    @JsonProperty("hint")
    public String hint;
    @JsonProperty("param_description")
    public String paramDescription;
    @JsonProperty("is_mandatory")
    public boolean isMandatory;
    @JsonProperty("default_value")
    public String defaultValue;
    @JsonProperty("param_name")
    public String paramName;
    @JsonProperty("is_cleartext")
    public boolean isCleartext;
    @JsonProperty("param_type")
    public String paramType;

}
