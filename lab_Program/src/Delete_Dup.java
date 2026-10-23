
public class Delete_Dup {
	public static void main(String[] args) {
		String name="yash bijwe";
		String str="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);

			if(str.indexOf(ch)== -1) {
				str+=ch;
			}
		}
		
		System.out.println(str);
		
	}

}
