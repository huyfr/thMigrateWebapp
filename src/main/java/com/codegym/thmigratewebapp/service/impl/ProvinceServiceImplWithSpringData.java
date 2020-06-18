package com.codegym.thmigratewebapp.service.impl;

import com.codegym.thmigratewebapp.model.Province;
import com.codegym.thmigratewebapp.repository.ProvinceRepository;
import com.codegym.thmigratewebapp.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class ProvinceServiceImplWithSpringData extends ProvinceService {
    @Autowired
    private ProvinceRepository repository;

    @Override
    protected CrudRepository<Province, Long> repository() {
        return repository;
    }
}
