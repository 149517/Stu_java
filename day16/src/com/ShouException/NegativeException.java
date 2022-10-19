package com.ShouException;

public class NegativeException extends RuntimeException{
    static final long serialVersionUID = -703489719324655L;
    public NegativeException(){

    }
    public NegativeException(String msg){
        super(msg);
    }
}
