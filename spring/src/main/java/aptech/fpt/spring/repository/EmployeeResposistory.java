package aptech.fpt.spring.repository;

import aptech.fpt.spring.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeResposistory extends PagingAndSortingRepository<Employee, Integer> {
    // TO DO
}
