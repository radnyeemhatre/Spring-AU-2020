package com.bharath.ws.soap;

import java.util.*;
import java.util.regex.Pattern;

import com.bharath.ws.soap.dto.RegisterProcessorRequest;
import com.bharath.ws.soap.dto.RegisterProcessorResponse;

public class RegisterProcessorImpl implements RegisterProcessor {
	
	public RegisterProcessorResponse processRegister(RegisterProcessorRequest registerProcessorRequest) {
		RegisterProcessorResponse registerProcessorResponse = new RegisterProcessorResponse();
		// Business Logic or a call to a Business Logic Class Goes Here.
		
		System.out.println("Request = "+registerProcessorRequest);
		if(!(registerProcessorRequest.getName().matches( "[A-Z][a-z]*" ))) {
			throw new RuntimeException("Please enter a valid Name.");
		}
		String email=registerProcessorRequest.getEmail();
		String emailcheck = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailcheck); 
        if(!pat.matcher(email).matches()||(email==null))
        	throw new RuntimeException("Please enter a valid Name.");
        
		registerProcessorResponse.setResult(true, registerProcessorRequest.getName(),email);
		return registerProcessorResponse;
	}

	@Override
	public RegisterProcessorResponse processPayment(RegisterProcessorRequest registerProcessorRequest) {
		return null;
	}
}
