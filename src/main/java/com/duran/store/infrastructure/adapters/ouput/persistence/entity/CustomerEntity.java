package com.duran.store.infrastructure.adapters.ouput.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "customers")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    @Getter @Setter
    private Long idCustomer;

    @Column(name = "first_name")
    @Getter @Setter
    private String firstname;

    @Column(name = "last_name")
    @Getter @Setter
    private String lastname;

    @Column(name = "email")
    @Getter @Setter
    private String email;

}
