
package com.lucid.techrd.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "action_id",
    "description",
    "is_sync",
    "action_params"
})
public class Action {

    @JsonProperty("action_id")
    public String actionId;
    @JsonProperty("description")
    public String description;
    @JsonProperty("is_sync")
    public boolean isSync;
    @JsonProperty("action_params")
    public List<ActionParam> actionParams = null;

}
