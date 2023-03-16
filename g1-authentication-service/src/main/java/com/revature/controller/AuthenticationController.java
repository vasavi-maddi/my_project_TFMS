package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.dto.PatientDto;
import com.revature.service.LoginService;
import com.revature.service.RegisterService;

@RestController
@RequestMapping("/api/v1")
public class AuthenticationController {
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/patient/register")
	public ResponseEntity<PatientDto> registerPatient(@RequestBody PatientDto patientDto){
		return new ResponseEntity<>(registerService.registerService(patientDto),HttpStatus.CREATED);
	}
	
	@PostMapping("/patient/login")
	public ResponseEntity<PatientDto> loginPatient(@RequestParam("email") String email,
			@RequestParam("password") String password){
		return new ResponseEntity<>(loginService.loginService(email,password),HttpStatus.ACCEPTED);
		
	}

}
