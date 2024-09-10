package net.javaguides.organizationservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Organization-Service - DepartmentController",
        description = "Organization Controller Exposes REST APIs for Department-Service"
)
@RestController
@RequestMapping("api/organizations")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;
    @Operation(
            summary = "Save Organization REST API",
            description = "Save Organization REST API is used to save department object in the database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP status 201 created"
    )
    //build saved organization REST Api
    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganizationDto = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(savedOrganizationDto, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Organization REST API",
            description = "Get Department REST API is used to get organization object from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 success"
    )
    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrganizationByCode(@PathVariable ("code") String organizationCode){
        OrganizationDto OrganizationDto = organizationService.getOrganizationByCode(organizationCode);
        return new ResponseEntity<>(OrganizationDto, HttpStatus.OK);
    }
}
