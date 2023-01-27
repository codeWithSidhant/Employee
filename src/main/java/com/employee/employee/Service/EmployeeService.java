package com.employee.employee.Service;

import com.employee.employee.Entity.Employee;
import com.employee.employee.Repository.EmployeeRepository;
import com.employee.employee.mode.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponse getDetail(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        return new EmployeeResponse(employee.getName(), employee.getDepartment(), employee.getAge());
    }

    @Override
    public EmployeeResponse getDetail(String dep) {
        Employee employee = employeeRepository.findEmployeeByDepartment(dep);
        return new EmployeeResponse(employee.getName(), employee.getDepartment(), employee.getAge());
    }

}
