package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.model.Company;
import com.oocl.springbootemployee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompanyRepository {
    private List<Company> companies = new ArrayList<>();

    public CompanyRepository(){
        companies.add(new Company(0, "OOCL"));
        companies.add(new Company(1, "IQAX"));
    }

    public List<Company> getAll() {
        return companies;
    }
}
