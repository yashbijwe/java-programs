package com.nit.methodreferance26_11_25;
import java.util.Scanner;
import java.util.function.Predicate;
class Check{
	public boolean checkUsername(String userName) {
		if(userName.length()>=5) {
			return true;
		}
		else return false;
	}
}

public class LoginSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Check c =new Check();
		Predicate<String> p=c::checkUsername;
		System.out.println("Enter the Username");
		if(p.test(sc.next())){
			System.out.println("Valid Username → Login Allowed");
		}
		else {
			System.out.println("Invalid Username");
		}
		
		sc.close();
	}

}
