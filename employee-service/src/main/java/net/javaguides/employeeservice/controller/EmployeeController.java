package net.javaguides.employeeservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.javaguides.employeeservice.dto.ApiResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.service.Employeeservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Employee-Service - DepartmentController",
        description = "Employee Controller Exposes REST APIs for Department-Service"
)
@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private Employeeservice employeeService;

    @Operation(
            summary = "Save Employee REST API",
            description = "Save Employee REST API is used to save department object in the database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP status 201 created"
    )
//build save employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @Operation(
            summary = "Get Employee REST API",
            description = "Get Employee REST API is used to get organization object from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 success"
    )
    // build get employee REST API
    @GetMapping("{EmpId}")
    public ResponseEntity<ApiResponseDto> getEmployee(@PathVariable("EmpId") Long employeeId){
        ApiResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
