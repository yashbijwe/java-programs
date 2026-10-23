package com.nit.exceptionhandling;

public class StringException {
	  public static void main(String[] args) {
	        try{String s = "abc";
	        s.charAt(5);
	    }
	    catch(StringIndexOutOfBoundsException e){
	        System.out.println("StringIndexOutOfBoundsException");

	    }
	      
	    }
}
