package net.javaguides.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.NonFinal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseDto {
    private EmployeeDto employee;
    private DepartmentDto department;
    private OrganizationDto organization;
}
