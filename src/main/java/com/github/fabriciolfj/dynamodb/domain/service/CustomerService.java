package com.github.fabriciolfj.dynamodb.domain.service;

import com.github.fabriciolfj.dynamodb.domain.model.Customer;
import com.github.fabriciolfj.dynamodb.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public Customer save(final Customer customer) {
        return repository.save(customer);
    }

    public Customer findByName(final String name) {
        return repository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Name not found: " + name));
    }

    public void delete(final String name) {
        final Customer customer = findByName(name);
        repository.delete(customer);
    }

    public Iterable<Customer> findAll() {
        return repository.findAll();
    }
}
