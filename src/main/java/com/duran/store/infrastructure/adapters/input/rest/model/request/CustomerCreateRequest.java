package com.duran.store.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreateRequest {

    @NotBlank(message = "The first name is required")
    @Getter @Setter
    private String firstname;

    @NotBlank(message = "The last name is required")
    @Getter @Setter
    private String lastname;

    @NotBlank(message = "The email is required")
    @Getter @Setter
    private String email;

}
