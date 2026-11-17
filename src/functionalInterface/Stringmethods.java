package functionalInterface;



public class Stringmethods {

	
	public void stringmethod() {
		String word="Madam";
		
		System.out.println("UpperCase: "+word.toUpperCase());
		System.out.println("Lowercase: "+word.toLowerCase());
		System.out.println("Length: "+word.length());
	
		
	}
	
	void reverse() {
		String word="Madam";
	
		String rev="";
	for (int i=word.length()-1;i>=0;i--) {
		rev=rev+word.charAt(i);
		
	}
	
	System.out.println("Reverse: "+rev);

	
		
	}
	public void palindrome() {
		String words="Madam";
		String word=words.toLowerCase();
		String rev="";
	for (int i=word.length()-1;i>=0;i--) {
		rev=rev+word.charAt(i);
		
	}
	


	if(word.equals(rev)) {
		System.out.println("Palindrome: yes");
	}
	else {
		System.out.println("Palindrome: no");
	}
		
	}
	
	
	public void count() {
		String name="Madam";
		int count=0;
		String word=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			char ch=word.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				
			}
			
		}
		System.out.println("Vowels: "+ count);
		
		
		
	}
	public static void main(String arg[]) {
		
		Stringmethods Stringmethods=new Stringmethods();
		Stringmethods.stringmethod() ;
		
		Stringmethods.reverse();
		
		Stringmethods.palindrome();
		Stringmethods.count();
	}
}
