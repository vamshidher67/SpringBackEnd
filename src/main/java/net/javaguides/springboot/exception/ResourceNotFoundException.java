//when resource doeesn't exist in DB, this exception is thrown
package net.javaguides.springboot.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;


    public ResourceNotFoundException(String message) {
        super(message);
    }
}
