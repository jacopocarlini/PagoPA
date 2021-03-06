package org.jacopocarlini.model.io;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@NotNull
public class ProfileResponse {

    /**
     * if true the user allowed to receive messages
     */
    @NotNull
    @JsonProperty(value = "sender_allowed")
    private Boolean senderAllowed;

    @JsonProperty(value = "preferred_languages")
    private List<String> preferredLanguages;
}
