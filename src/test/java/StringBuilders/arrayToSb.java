package StringBuilders;

public class arrayToSb {
	 public static StringBuilder  arrayToSb(String[] r) 
	  {

	     StringBuilder arrStr = new StringBuilder();
	  for(String s : r) {
		  arrStr.append(s);
	  }
	  
	  return arrStr;
	   
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    String[]  arr = new String[]{"a","1","2"};
	    

	    StringBuilder recipt = arrayToSb(arr);
	    System.out.print(recipt.toString());

	   
	    
	  }//end main
}
