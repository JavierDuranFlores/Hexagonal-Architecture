package com.duran.store.infrastructure.adapters.ouput.persistence.mapper;

import com.duran.store.domain.model.Customer;
import com.duran.store.infrastructure.adapters.ouput.persistence.entity.CustomerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerPersistenceMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

    List<Customer> toCustomers(List<CustomerEntity> customerEntities);
}