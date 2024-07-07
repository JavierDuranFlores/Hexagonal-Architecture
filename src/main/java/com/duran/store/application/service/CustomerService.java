package com.duran.store.application.service;


/* implementa el puerto de entrada y va a ser uso del puerto de salida */

import com.duran.store.application.ports.input.CustomerServicePort;
import com.duran.store.application.ports.ouput.CustomerPersistencePort;
import com.duran.store.domain.exception.ResourceNotFoundException;
import com.duran.store.domain.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
/* caso de uso */
@Service("customerService")
@RequiredArgsConstructor
public class CustomerService implements CustomerServicePort {

    private final CustomerPersistencePort customerPersistencePort;

    @Override
    public Customer getCustomerById(Long idCustomer) {
        return customerPersistencePort.findById(idCustomer)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerPersistencePort.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerPersistencePort.save(customer);
    }

    @Override
    public Customer updateCustomer(Long idCustomer, Customer customer) {
        return customerPersistencePort.findById(idCustomer)
                .map(savedCustomer->{
                    savedCustomer.setFirstname(customer.getFirstname());
                    savedCustomer.setLastname(customer.getLastname());
                    savedCustomer.setEmail(customer.getEmail());
                    return customerPersistencePort.save(savedCustomer);
                })
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Customer deleteCustomerById(Long idCustomer) {
        if (customerPersistencePort.findById(idCustomer).isEmpty())
            throw new ResourceNotFoundException();
        return customerPersistencePort.deleteById(idCustomer);
    }
}
