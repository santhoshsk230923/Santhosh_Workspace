package com.springassesment.api.albanerodemo.exception;

public class ETLJobsNotFound extends RuntimeException{
    public ETLJobsNotFound(Long id){
        super("ETLJob id is not found "+id);
    }
}
