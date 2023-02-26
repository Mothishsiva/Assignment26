package Asignment1;

import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
	int [] num= {2,5,6,8,9,1,3,4};
	 Arrays.sort(num);
	 int j=0;
	 for(int i=0;i<num.length;i++) {
		 j=i+1;
		 if(num[i]!=j) {
			 System.out.println(j);
			 break;
		 }
	 
}
}
}
