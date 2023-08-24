package com.example.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customEndpoint")
public class CustomEndpoint {

    @ReadOperation
    public ResponseEntity<ApiResponse> customOperation() {
    	return ResponseEntity.ok(new ApiResponse("This is a custom Actuator endpoint!"));

    }
    
    private static class ApiResponse {
        private final String message;

        public ApiResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
