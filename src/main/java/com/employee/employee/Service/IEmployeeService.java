package com.employee.employee.Service;

import com.employee.employee.mode.EmployeeResponse;

public interface IEmployeeService {
EmployeeResponse getDetail(Long id);
EmployeeResponse getDetail(String dep);
}
