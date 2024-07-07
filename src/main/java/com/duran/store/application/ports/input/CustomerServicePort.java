package com.duran.store.application.ports.input;

import com.duran.store.domain.model.Customer;

import java.util.List;

public interface CustomerServicePort {

    public Customer getCustomerById(Long idCustomer);

    public List<Customer> getCustomers();

    public Customer saveCustomer(Customer customer);

    public Customer updateCustomer(Long idCustomer, Customer customer);

    public Customer deleteCustomerById(Long idCustomer);

}
