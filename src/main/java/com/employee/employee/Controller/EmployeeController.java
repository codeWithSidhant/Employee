package com.employee.employee.Controller;

import com.employee.employee.mode.EmployeeResponse;
import com.employee.employee.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value ="/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(value = "/get-detail")
    public EmployeeResponse getDetail(@RequestParam Long id) {
        return employeeService.getDetail(id);
    }
    @GetMapping(value = "/get-detail-dep")
    public  EmployeeResponse getDetail(@RequestParam String dep){
        return employeeService.getDetail(dep);
    }
}
