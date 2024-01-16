package String;

public class countPunctuation {
	public static void main(String[] args) {
		String str="Hema said,'I want to play with you'.Could you?";
		int count=0;
		for (int i=0;i<str.length();i++) {
			
		if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
				str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') 
			count++;
	}
		System.out.println("Total punctuation marks: "+count);
	}
}
