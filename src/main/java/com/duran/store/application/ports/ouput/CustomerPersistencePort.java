package com.duran.store.application.ports.ouput;

import com.duran.store.domain.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerPersistencePort {

    abstract public Optional<Customer> findById(Long idCustomer);

    abstract public List<Customer> findAll();

    abstract public Customer save(Customer customer);

    abstract public Customer deleteById(Long idCustomer);
}
