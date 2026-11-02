package condition;

import java.util.Scanner;

public class VowelorConsonant {
	Scanner scan=new Scanner(System.in);
	
	void letter() {
		 System.out.println("Vowel or Consonant program");
		 
		 System.out.print("enter the character:");
		 char c =scan.next().charAt(0);
		 
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
				c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			
			System.out.println("vowel");
			
		}
		else if((c>='a' && c<='z')||(c>='A' && c<='Z')){
			System.out.println("consonant");
			
		}
		else {
			System.out.println("enter the valid character");
		}
	}

}
