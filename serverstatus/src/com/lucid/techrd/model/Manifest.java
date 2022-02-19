
package com.lucid.techrd.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "app_name",
    "description",
    "global_params",
    "version",
    "actions"
})
public class Manifest {

    @JsonProperty("app_name")
    public String appName;
    @JsonProperty("description")
    public String description;
    @JsonProperty("global_params")
    public List<GlobalParam> globalParams = null;
    @JsonProperty("version")
    public String version;
    @JsonProperty("actions")
    public List<Action> actions = null;

}
