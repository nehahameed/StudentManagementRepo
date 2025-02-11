package com.example.demo.exception;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Studentexception {
	


		@ExceptionHandler(IllegalArgumentException.class)
		public ResponseEntity<Map<String,String>> handleIllegalArgumentException(IllegalArgumentException ex){
			Map<String,String> errorResponse= new HashMap<>();
			errorResponse.put("error", ex.getMessage());
			return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
		

	
		}
}
