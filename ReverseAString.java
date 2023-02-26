package Asignment1;

import java.util.Scanner;

public class ReverseAString {
 public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter The Name");
	String name=scan.nextLine();
	char [] ch=name.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.println(ch[i]);
	}
}
}
