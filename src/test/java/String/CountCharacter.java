package String;

public class CountCharacter {
	public static void main(String[] args) {
		String string="My name is Sravanthi";
		int count=0;
		for (int i=0;i<string.length();i++) {
			if(string.charAt(i) != ' ')
			count++;
		}
		System.out.println("Total no of characters: "+count);
	}

}
