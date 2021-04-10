package com.github.fabriciolfj.dynamodb.domain.repository;

import com.github.fabriciolfj.dynamodb.domain.model.Customer;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface CustomerRepository extends CrudRepository<Customer, String> {

    Optional<Customer> findByName(final String name);
}
