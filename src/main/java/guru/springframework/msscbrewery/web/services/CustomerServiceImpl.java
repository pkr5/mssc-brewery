package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomer(UUID id){
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Johnny")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void deleteCustomer(UUID id) {

    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {

    }
}
