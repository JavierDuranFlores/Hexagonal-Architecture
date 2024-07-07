package com.duran.store.infrastructure.adapters.input.rest.model.response;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

    @Getter @Setter
    private Long idCustomer;

    @Getter @Setter
    private String firstname;

    @Getter @Setter
    private String lastname;

    @Getter @Setter
    private String email;


}
