package week2.day2.assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String word="changeme";
		char[] letter =word.toCharArray();
		int length = letter.length;
		for(int i=0;i<length;i++) {
			if(i%2!=0) {
				String strcpy="";
				strcpy=strcpy+letter[i];
				System.out.println(strcpy.toUpperCase());
			}
			else {
				System.out.println(letter[i]);
			}
		}
	}

}
