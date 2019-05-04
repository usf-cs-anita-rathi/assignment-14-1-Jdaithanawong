
public class Handshake {
	public static int Handshake(int n)  
	{ 
	    // when n becomes 0 that  
	    // means all the persons  
	    // have done handshake 
	    // with other 
	    if (n == 0)  
	    {
	        return 0; 
	    }
	    else
	    {
	    	System.out.println("When there are " + n + " people in the room, there will be " + (n-1) + " handshakes. ");
	        return (n - 1) + Handshake(n - 1); 
	    }
	} 
	  
	// Driver Code 
	public static void main (String[] args)  
	{
		int n = 10;
	    System.out.print(Handshake(n) + " is the total amount of handshakes made by " + n + " people."); 
	} 
	} 