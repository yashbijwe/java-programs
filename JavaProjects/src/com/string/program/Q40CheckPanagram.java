package com.string.program;

public class Q40CheckPanagram {

	public static void main(String[] args) {
		 String str = "The quick brown fox jumps over the lazy dog";
	        str = str.toLowerCase();
	        
	        boolean[] seen = new boolean[26];
	        for (int i = 0; i < str.length(); i++) {
	        	char ch =str.charAt(i);
	        	if(ch>='a' && ch<='z') {
	        		seen[ch -'a']=true;
	        	}
				
			}
	        boolean isPanagram=true;
	        for(boolean b:seen) {
	        	if(!b) {
	        		isPanagram=false;
	        		break;
	        	}
	        	
	        }
         if(isPanagram) {
        	 System.out.println("Panagram");
         }
         else {
        	 System.out.println("Not Panagram");
         }
	}

}
