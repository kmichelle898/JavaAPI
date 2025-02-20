package first.springboot.springboot_first.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import first.springboot.springboot_first.entities.Employee;
import first.springboot.springboot_first.models.EmployeeDto;
import first.springboot.springboot_first.services.EmployeeService;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String CreateEmployee(@RequestBody EmployeeDto employee) {
        //TODO: process POST request
        return employeeService.CreateEmployee(employee);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> GetAllEmployees() {
        try {
            return employeeService.GetAllEmployees();
        } catch (Exception e) {
            // TODO: handle exception
        }
          return new CopyOnWriteArrayList<>();
    }
    
}
