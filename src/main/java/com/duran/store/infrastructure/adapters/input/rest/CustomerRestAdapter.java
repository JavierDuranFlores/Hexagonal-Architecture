package com.duran.store.infrastructure.adapters.input.rest;

import com.duran.store.application.ports.input.CustomerServicePort;
import com.duran.store.infrastructure.adapters.input.rest.mapper.CustomerRestMapper;
import com.duran.store.infrastructure.adapters.input.rest.model.request.CustomerCreateRequest;
import com.duran.store.infrastructure.adapters.input.rest.model.response.CustomerResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerRestAdapter {

    private final CustomerServicePort customerServicePort;
    private final CustomerRestMapper customerRestMapper;

    @GetMapping("/{idCustomer}")
    public CustomerResponse customer(@PathVariable Long idCustomer) {
        return customerRestMapper.toCustomerResponse(customerServicePort.getCustomerById(idCustomer));
    }

    @GetMapping("/customers")
    public List<CustomerResponse> customers() {
        return customerRestMapper.toCustomersResponse(customerServicePort.getCustomers());
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> saveCustomer(@Valid @RequestBody CustomerCreateRequest customerRequest) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(customerRestMapper.toCustomerResponse(
                        customerServicePort.saveCustomer(customerRestMapper.toCustomer(customerRequest))));
    }

    @PutMapping("/{idCustomer}")
    public CustomerResponse updateCustomer(@PathVariable  Long idCustomer, @Valid @RequestBody CustomerCreateRequest customerRequest) {
        return customerRestMapper.toCustomerResponse(customerServicePort.updateCustomer(idCustomer, customerRestMapper.toCustomer(customerRequest)));
    }

    @DeleteMapping("/{idCustomer}")
    public CustomerResponse deleteCustomerById(@PathVariable Long idCustomer) {
        return customerRestMapper.toCustomerResponse(customerServicePort.deleteCustomerById(idCustomer));
    }

}
