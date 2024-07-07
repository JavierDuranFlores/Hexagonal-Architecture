package com.duran.store.infrastructure.adapters.ouput.persistence;

import com.duran.store.application.ports.ouput.CustomerPersistencePort;
import com.duran.store.domain.model.Customer;
import com.duran.store.infrastructure.adapters.ouput.persistence.mapper.CustomerPersistenceMapper;
import com.duran.store.infrastructure.adapters.ouput.persistence.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/* implementa el puerto de salida */
@Component
@RequiredArgsConstructor
public class CustomerPersistenceAdapter implements CustomerPersistencePort {

    private final CustomerRepository customerRepository;

    private final CustomerPersistenceMapper customerPersistenceMapper;

    @Override
    public Optional<Customer> findById(Long idCustomer) {
        return customerRepository.findById(idCustomer)
                .map(customerPersistenceMapper::toCustomer);
    }

    @Override
    public List<Customer> findAll() {
        return customerPersistenceMapper.toCustomers(customerRepository.findAll());
    }

    @Override
    public Customer save(Customer customer) {
        return customerPersistenceMapper.toCustomer(customerRepository.save(customerPersistenceMapper.toCustomerEntity(customer)));
    }

    @Override
    public Customer deleteById(Long idCustomer) {
        return customerPersistenceMapper.toCustomer(customerRepository.findById(idCustomer)
                .map(customerEntity -> {
                    customerRepository.deleteById(idCustomer);
                    return customerEntity;
                })
                .orElseThrow());
    }

}
