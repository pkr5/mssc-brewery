package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID id);
    CustomerDto saveCustomer(CustomerDto customerDto);
    void updateCustomer(UUID id, CustomerDto customerDto);
    void deleteCustomer(UUID id);
}
