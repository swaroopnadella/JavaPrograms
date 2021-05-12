package strings;

public class ReverseEachWordLettersOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-reverse each and every word of the the string
		//---i am swaroop
		//---expected: i ma pooraws

		//First Way - using inbuilt reverse method
		reverseWordLettersWithInBuiltMethods();
		
		//Second way using nested for loops
		reverseWordLettersUsingCharAtNestForLoops();
		
		//Third Way - using CharAt Separate method
		reverseWordLettersUsingCharAtSeparateMethod();
	}
	
	//First Way - using inbuilt reverse method
	public static void reverseWordLettersWithInBuiltMethods() {
		
		String sentence = "This is Java Strings Program Practice Program";
		String[] words = sentence.split(" ");
		
		System.out.println("Input String: "+sentence);
		
		StringBuilder rev_sentence = new StringBuilder(words[0]).reverse();
		for(int i=1;i<words.length;i++) {
			rev_sentence = rev_sentence.append(" ").append(new StringBuilder(words[i]).reverse());
		}
		
		System.out.println("Reveresed words of the sentence using Inbuilt methods: "+rev_sentence);
	}
	
	//Second way using nested for loops
		public static void reverseWordLettersUsingCharAtNestForLoops() {
			String sentence = "This is Java Strings Program Practice Program";
			System.out.println("\nInput String: "+sentence);
			String[] words = sentence.split("\\s");
			
			String rev_sentence="";
			for(String s:words) {
				String temp = "";
				for(int i=s.length()-1;i>=0;i--) {
					temp=temp+s.charAt(i);
				}
				rev_sentence+= temp+" ";
			}
			
			System.out.println("Reveresed words of the sentence: "+rev_sentence);
		}
	
	//Third Way - using CharAt Separate method
	public static void reverseWordLettersUsingCharAtSeparateMethod() {
		String sentence = "This is Java Strings Program Practice Program";
		System.out.println("\nInput String: "+sentence);
		String[] words = sentence.split(" ");
		
		String rev_sentence="";
		rev_sentence = usingCharAt(words[0]);
		for(int i=1;i<words.length;i++) {
			rev_sentence = rev_sentence + " " + usingCharAt(words[i]);
		}
		
		System.out.println("Reveresed words of the sentence: "+rev_sentence);
	}
	
	public static String usingCharAt(String st) {

		String rev = "";

		for (int i = st.length() - 1; i >= 0; i--)
			rev = rev + st.charAt(i);

		return rev;
	}
	
}
