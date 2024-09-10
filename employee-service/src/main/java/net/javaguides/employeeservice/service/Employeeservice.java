package net.javaguides.employeeservice.service;

import net.javaguides.employeeservice.dto.ApiResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;

public interface Employeeservice {
     EmployeeDto saveEmployee(EmployeeDto employeeDto);
     ApiResponseDto getEmployeeById(Long employeeId);
}
