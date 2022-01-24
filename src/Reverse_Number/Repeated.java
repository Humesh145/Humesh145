package Reverse_Number;

public class Repeated {
	

	     public static void main(String[] args) {  
	   String a = "Good day";
	   int count;
	   char string[] = a.toCharArray();
	   
	   System.out.println("Duplicate character for " + a + " are");
	   for (int i = 0; i < string.length; i++) {
		   count=1;
		   for (int j = i+1; j < string.length; j++) {
			   if (string[i]==string[j] && string[i] != ' ') {
				   count++;				                         
						}
					}
		   if (count>1 && string[i] != ' ') {
			   System.out.println(string[i]);
		}
		
	}
	   
   
	     }
}
	    
	   
