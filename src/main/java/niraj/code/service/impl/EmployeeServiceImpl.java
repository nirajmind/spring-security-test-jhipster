package niraj.code.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import niraj.code.domain.Employee;
import niraj.code.repository.EmployeeRepository;
import niraj.code.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Employee}.
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        log.debug("Request to save Employee : {}", employee);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        log.debug("Request to update Employee : {}", employee);
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> partialUpdate(Employee employee) {
        log.debug("Request to partially update Employee : {}", employee);

        return employeeRepository
            .findById(employee.getId())
            .map(existingEmployee -> {
                if (employee.getEmployeeId() != null) {
                    existingEmployee.setEmployeeId(employee.getEmployeeId());
                }
                if (employee.getEmployeeName() != null) {
                    existingEmployee.setEmployeeName(employee.getEmployeeName());
                }
                if (employee.getTitle() != null) {
                    existingEmployee.setTitle(employee.getTitle());
                }
                if (employee.getBusinessUnit() != null) {
                    existingEmployee.setBusinessUnit(employee.getBusinessUnit());
                }
                if (employee.getPlace() != null) {
                    existingEmployee.setPlace(employee.getPlace());
                }
                if (employee.getSupervisorId() != null) {
                    existingEmployee.setSupervisorId(employee.getSupervisorId());
                }
                if (employee.getCompetencies() != null) {
                    existingEmployee.setCompetencies(employee.getCompetencies());
                }
                if (employee.getSalary() != null) {
                    existingEmployee.setSalary(employee.getSalary());
                }

                return existingEmployee;
            })
            .map(employeeRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        log.debug("Request to get all Employees");
        return employeeRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Employee> findOne(Long id) {
        log.debug("Request to get Employee : {}", id);
        return employeeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Employee : {}", id);
        employeeRepository.deleteById(id);
    }
}
