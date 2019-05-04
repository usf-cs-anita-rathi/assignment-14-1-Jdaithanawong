import java.util.Scanner;
public class Contains {
	 public static boolean Contains(String s1, String s2,int index)
	 {
		 if((s1 == null) || (s2 == null)){
		        return false; 
		    }

		    if(index + (s2.length() - 1) >= s1.length()){
		        return false; 
		    } 

		    int count = 0, j = 0;

		    for(int i = index; i < (s2.length() + index); i++){ 
		        if(s1.charAt(i) == s2.charAt(j)){
		            if((i != 0) && (j != 0)){
		                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
		                    count++;
		                }  
		            } else {
		                count++;
		            }
		        }
		        j++;
		    } 

		    if(count == s2.length()){
		        return true; 
		    } 

		    return Contains(s1, s2, index + 1);
	 }
	 
	 public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please input the first string: ");
		 String s1 = input.next();
		 System.out.println("Please input the second string: ");
		 String s2 = input.next();
		 if(Contains(s1,s2, 0) == true)
		 {
			 System.out.println("One of your strings is a substring of the other.");
		 } else
		 {
			 System.out.println("Neither of your strings are a substring of the other.");
		 }
	 }
}
