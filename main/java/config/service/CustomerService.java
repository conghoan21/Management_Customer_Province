package config.service;

import config.model.Customer;
import config.model.Province;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface CustomerService {
    Page<Customer>findAll(Pageable pageable);
    Iterable<Customer>findAllByProvince(Province province);
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
