package first.springboot.springboot_first.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Document(value = "employee")
@Data
@Getter
@Builder
public class Employee {
    @Id
    private String Id;
    @Field(name = "employee_name")
    private String Name;
    private String Email;
    private String Position;
    private String Department;
    private LocalDate BirthDate;
    private String Sss;
    private String Tin;
    private boolean IsDeleted;
    private String ZodiacSign;

    // public Employee(EmployeeDto employeeDto) {
    //     this.Name = employeeDto.Name;
    //     this.Email = employeeDto.Email;
    //     this.BirthDate = employeeDto.BirthDate;
    //     this.Department = employeeDto.Department;
    //     this.Position = employeeDto.Position;
    //     this.Tin = employeeDto.Tin;
    //     this.ZodiacSign = employeeDto.ZodiacSign;
    //     this.Sss = employeeDto.Sss;
    //     this.IsDeleted = employeeDto.IsDeleted;
    // }
}