package config.service;

import config.model.Customer;
import config.model.Province;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface CustomerService {
    Iterable<Customer>findAll();
    Iterable<Customer>findAllByProvince(Province province);
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
