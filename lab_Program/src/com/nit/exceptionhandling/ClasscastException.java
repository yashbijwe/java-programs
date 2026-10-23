package com.nit.exceptionhandling;

public class ClasscastException {
	public static void main(String[] args){
        try{
        Object obj = new String("test");
            Integer i = (Integer) obj;
        }
        catch(ClassCastException e){
            System.out.println("ClassCastException");
        }
    }
}
