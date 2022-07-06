package org.example.exception;

public class SessionFactoryConnectionException extends RuntimeException{
    public SessionFactoryConnectionException(String msg){
        super(msg);
    }
}
