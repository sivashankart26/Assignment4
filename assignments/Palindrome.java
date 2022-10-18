package week2.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		String name="malayalam";
		String reversename = "";
		char[] charArray=name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			reversename=reversename+charArray[i];
		}
		System.out.println(reversename);
		if(reversename.equals(name)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
