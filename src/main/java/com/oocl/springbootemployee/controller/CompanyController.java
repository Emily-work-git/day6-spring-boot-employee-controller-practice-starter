package com.oocl.springbootemployee.controller;

import com.oocl.springbootemployee.model.Company;
import com.oocl.springbootemployee.repository.CompanyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private final CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("")
    public List<Company> getAll() {
        return companyRepository.getAll();
    }
    
}
