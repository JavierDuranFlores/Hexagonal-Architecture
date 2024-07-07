package com.duran.store.domain.model;

/* Los modelos del dominio tienen que ser simplemente pojos de Java*/

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Getter @Setter
    private Long idCustomer;

    @Getter @Setter
    private String firstname;

    @Getter @Setter
    private String lastname;

    @Getter @Setter
    private String email;

}
