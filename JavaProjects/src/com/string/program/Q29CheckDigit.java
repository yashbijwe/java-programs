package com.string.program;

public class Q29CheckDigit {
	 public static void main(String[] args) {
		 String str="123";
		 
		 char ch[]=str.toCharArray();
		 boolean isdigit=true;
		 for (int i = 0; i < ch.length; i++) {
			if(!(ch[i]>='0' && ch[i]<='9')) {
				isdigit=false;
				break;
			}
		}
		 if(isdigit) {
			 System.out.println("all digit");
		 }
		 else {
			 System.out.println("only digit allowed.");
		 }
	}

}
