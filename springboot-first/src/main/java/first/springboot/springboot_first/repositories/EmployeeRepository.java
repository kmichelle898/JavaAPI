package first.springboot.springboot_first.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import first.springboot.springboot_first.entities.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
