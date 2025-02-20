package first.springboot.springboot_first.models;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class EmployeeDto {
     
    @Getter public String Id;
    @Getter public String Name;
    @Getter public String Email;
    @Getter public String Position;
    @Getter public String Department;
    @Getter public LocalDate BirthDate;
    @Getter public String Sss;
    @Getter public String Tin;
    @Getter public boolean IsDeleted;
    @Getter public String ZodiacSign;
}
