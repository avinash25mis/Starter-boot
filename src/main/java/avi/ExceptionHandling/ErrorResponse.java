package avi.ExceptionHandling;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


public class ErrorResponse {



	public ErrorResponse(String message, String details) {
		super();
		this.message = message;
		this.details = details;
	}

	private String message;
	private String details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}


}
