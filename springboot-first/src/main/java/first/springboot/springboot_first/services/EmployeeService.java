package first.springboot.springboot_first.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.springboot.springboot_first.entities.Employee;
import first.springboot.springboot_first.models.EmployeeDto;
import first.springboot.springboot_first.repositories.EmployeeRepository;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String CreateEmployee(EmployeeDto employee){
        try {
            //Employee emp = new Employee(employee);
            
            Employee emp = Employee.builder()
                .Name(employee.getName())
                .BirthDate(employee.getBirthDate())
                .Department(employee.getDepartment())
                .Email(employee.getEmail())
                .Position(employee.getPosition())
                .Sss(employee.getSss())
                .Tin(employee.getTin())
                .ZodiacSign(employee.getZodiacSign())
                .IsDeleted(false).build();
            employeeRepository.save(emp);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return "Employee Created Successfully";
    }

    public List<Employee> GetAllEmployees() throws Exception{
        try {
           return employeeRepository.findAll();
           
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception(e.getMessage());
        }
    }
}
