package Asignment1;

public class PalinDrome {
	// create main method
public static void main(String[] args) {
	// Given string is madam
	String input ="madam";
	// find the given string length
	int len=input.length();
	//  String input convert to character
	char [] ch=input.toCharArray();
	// given emty string to given rev value
	String rev ="";
	// itreate the values 
	for(int i=len-1;i>=0;i--) {
	rev= rev+ch[i];
	}
	// compare the string input / string rev 
	if(input.equals(rev)) {
		// its  same  print plaindrome
		System.out.println("PalinDrome");
	}else {
		// its does not same print not a plaindorme
		System.out.println("Not A PalinDrome");
}
}
}
