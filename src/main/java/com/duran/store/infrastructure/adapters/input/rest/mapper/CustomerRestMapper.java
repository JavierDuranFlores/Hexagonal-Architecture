package com.duran.store.infrastructure.adapters.input.rest.mapper;

import com.duran.store.domain.model.Customer;
import com.duran.store.infrastructure.adapters.input.rest.model.request.CustomerCreateRequest;
import com.duran.store.infrastructure.adapters.input.rest.model.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerRestMapper {

    Customer toCustomer(CustomerCreateRequest customerCreateRequest);

    CustomerResponse toCustomerResponse(Customer customer);

    List<CustomerResponse> toCustomersResponse(List<Customer> customers);

}
