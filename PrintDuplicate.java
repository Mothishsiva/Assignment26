package Asignment1;

public class PrintDuplicate {
public static void main(String[] args) {
   	// given the input
     int [] num= {11,22,33,44,55,66,22,77,11};
    // Find the length
    int len=num.length;
    // iteration the values
     for(int i=0;i<len;i++) {
	 for(int j=i+1;j<len;j++) {
    //copare the both values
	 if(num[i]==num[j])  {
   //print the duplicate num
		  System.out.println(" the duplicate num is :" +num[j]);
	  
 }
   
 }
}
}
}