package com.github.fabriciolfj.dynamodb.api.controller;

import com.github.fabriciolfj.dynamodb.api.dto.CustomerDTO;
import com.github.fabriciolfj.dynamodb.api.mapper.CustomerMapper;
import com.github.fabriciolfj.dynamodb.domain.model.Customer;
import com.github.fabriciolfj.dynamodb.domain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper mapper;

    @GetMapping
    public Iterable<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/{name}")
    public Customer findByName(@PathVariable("name") final String name) {
        return customerService.findByName(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody final CustomerDTO dto) {
        return customerService.save(mapper.toModel(dto));
    }

    @DeleteMapping("/{name}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("name") final String name) {
        customerService.delete(name);
    }
}
