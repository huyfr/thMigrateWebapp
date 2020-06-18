package com.codegym.thmigratewebapp.service;

import com.codegym.thmigratewebapp.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

public abstract class CustomerService extends AbstractEntityServiceImplWithSpringData<Customer, Long> {
    public abstract Page<Customer> findAll(Pageable pageInfo);

    public abstract List<Customer> search(String keyword);

    public abstract Page<Customer> search(String keyword, Pageable pageInfo);
}