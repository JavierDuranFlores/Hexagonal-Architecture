package com.duran.store.infrastructure.adapters.ouput.persistence.repository;

import com.duran.store.infrastructure.adapters.ouput.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
