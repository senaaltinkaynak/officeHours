package StringBuilders;

public class replaceWithString {
	/*
	 * replaceWith gets a String array and two other strings.it returns a StringBuilder object.

It searches for instances of replace inside r and then replaces them with replaceWith.

for example:

replaceWith(["a","b","a","b","c"],"b","a")
returns:
StringBuilder("aaaac")

replaceWith(["1","2","22","11","1"],"1","2")
returns:
StringBuilder("2222112")

replaceWith(["foo","bar"],"bar","foo")
returns:
StringBuilder("foofoo")
	 */
	  public StringBuilder replaceWith(String[] r,String replace,String replaceWith) 
	  {
	   	StringBuilder stb = new StringBuilder();
				  for(int i = 0; i < r.length; i++) {
					 
					  if(r[i].equals(replace)) {
						  stb.append(replaceWith);
					  }else {
						  stb.append(r[i]);
					  }
				  }
				  
				  return stb;
	   
	  }
	  
	  public static void main(String[] args)
	  {
		  replaceWithString m = new replaceWithString();
	    
	    String[] r= new String[]{"a","b","a","b"};
	    
	    StringBuilder tst = m.replaceWith(r,"b","a");
	    System.out.print(tst);
	    
	  }//end main
}
