package com.fitsight.fsserviceuser.messageq.envelop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fitsight.fsserviceuser.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserMessage {
    @NotBlank
    @JsonProperty
    private String email;

    @NotBlank
    @JsonProperty
    private String firstName;

    @NotBlank
    @JsonProperty
    private String lastName;

    public User toUser() {
        return User.builder().email(email).firstName(firstName).lastName(lastName).build();
    }
}
