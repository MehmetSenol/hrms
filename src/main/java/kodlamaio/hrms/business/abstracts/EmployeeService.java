package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    Result add(Employee employee);
    DataResult<List<Employee>> getAll();
}
