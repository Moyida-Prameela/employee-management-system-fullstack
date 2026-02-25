package com.ems.dto;
//this is for transfer the data between client and server
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	
	

}
