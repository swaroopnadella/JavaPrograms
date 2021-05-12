package strings;

public class SpecialCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		String s = "{:}?<>This&is#$Special!@Characters%^test*(";
		
		System.out.println("Input String: "+s);
		
		count = usingCharacterClassSpecialCharactersCount(s);
		
		if(count == 0)
			System.out.println("No Special Characters Found");
		else
			System.out.println("String has Special Characters\n"+count+" "+"Special Characters Found");
		
	}
	
	public static int usingCharacterClassSpecialCharactersCount(String str) {
		
		int count1=0;
		
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetterOrDigit(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i)))
				count1++;
		}
		
		return count1;
	}

}
