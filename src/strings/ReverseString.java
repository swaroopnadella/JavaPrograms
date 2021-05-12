package strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Swaroop Krishna";
		
		String str_rev = usingCharAt(str);
		System.out.println("Using charAt method reversed String: "+str_rev);
		
		String str_rev1 = usingCharArray(str);
		System.out.println("Using charArray method reversed String: "+str_rev1);
	}
	
	//using Char Array
	public static String usingCharArray(String st1) {
		
		String rev1 = "";
		
		char[] ch = st1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
			rev1=rev1+ch[i];
		
		return rev1;
	}
	
	//using charAt
	public static String usingCharAt(String st) {
		
		String rev = "";
		
		for(int i=st.length()-1;i>=0;i--)
			rev=rev+st.charAt(i);
		
		return rev;
	}

}
