package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Department-Service REST APIs",
				description = "Department Service REST Apis Documentations",
				contact = @Contact(
						name = "Sumit",
						email = "sumitsdhandar@gmail.com",
						url = "https://javaguides.net"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://javaguides.net"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department Service Doc",
				url = "https://javaguides.net"
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
