package com.eyeco.genmeserver.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GenMeApplicationException extends RuntimeException{
    private ErrorCode errorCode;
    private String message;

    public GenMeApplicationException(ErrorCode errorCode){
        this.errorCode = errorCode;
        this.message = null;
    }

    @Override
    public String getMessage(){
        if(message == null){
            return errorCode.getMessage();
        }else{
            return String.format("%s, %s", errorCode.getMessage(),message);
        }
    }
}
