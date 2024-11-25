package com.oocl.springbootemployee.controller;

import com.oocl.springbootemployee.model.Employee;
import com.oocl.springbootemployee.model.Gender;
import com.oocl.springbootemployee.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @GetMapping(path = "")
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @GetMapping(path = "/{id}")
    public Employee getById(@PathVariable int id) {
        return employeeRepository.getById(id);
    }

    @GetMapping(params = {"gender"})
    public List<Employee> getAllByGender(@RequestParam Gender gender){
        return employeeRepository.getAllByGender(gender);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
