package com.corp.basic.models;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String exception) {
        super(exception);
    }

}