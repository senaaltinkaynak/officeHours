package StringBuilders;

public class compareToString {
	/*
	 * isSame tests if a given String is the same as a given StringBuilder.

it gets a String a and a StringBuilder b and returns a boolean.

for example:

isSame("a",StringBuilder("b"))
returns : false

isSame("a",StringBuilder("a"))
returns : true
	 */
	  public boolean isSame(String a,StringBuilder b) 
	  {
	      String s = b.toString();
		    if(a.equals(s)) {
		    	return true;
		    }
		    
		    return false;
		  
	  
	  }
	  
	  public static void main(String[] args)
	  {
		  compareToString m = new compareToString();
	    
	    
	    boolean tst = m.isSame("test",new StringBuilder("test"));
	    System.out.print(tst);

	   
	    
	  }//end main
}
