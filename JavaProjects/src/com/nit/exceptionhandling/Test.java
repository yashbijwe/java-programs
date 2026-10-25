package com.nit.exceptionhandling;

import java.sql.SQLException;
import java.util.Scanner;


public class Test {

	public static void test() throws SQLException , AbhijeetException {
	throw new AbhijeetException("This is a custom exception message");

	}

	public static void main(String[] args) {

		try {
			System.out.println(10);
			throw new AbhijeetException("This is a custom exception message");
		} 
		
		catch (AbhijeetException e) {
			System.out.println("Caught AbhijeetException: " + e.getMessage());
		} 
		
		catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		} 
		finally {
			System.out.println("Finally block executed.");
		}
	}
}
