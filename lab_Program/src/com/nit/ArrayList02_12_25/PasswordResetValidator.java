package com.nit.ArrayList02_12_25;

public class PasswordResetValidator {
  
	public String removeKey(String oldPassword, String unlockKey) {
				
		if(oldPassword.contains(unlockKey)) {
		
		
		return  oldPassword.replace(unlockKey, "");
		}
		else return oldPassword;
			
	}
	public static void main(String[] args) {
		PasswordResetValidator p1=new PasswordResetValidator();
		System.out.println(p1.removeKey(  "mypasswordtoken12", "token"));
	}
}
