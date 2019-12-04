package StringBuilders;

public class exampleSB03 {
	/*
	 * A post must have less then an amount of characters to be posted. this method gets a few posts from a database.

to make everything faster because the method can get a huge amount posts, it is required to use StringBuilder to concatenate strings which is faster then using "+" operator to do the same.
 
the posts are represented by: String[] r 
and the character limit by: int size 

Only posts that are equal or less than the limit will be returned.
also after every post you will need to add a html line break tag ("<br>") as its for  a web page.


for example:

trim_posts(["abc","foo bar","123"],5)
returns: "abc<br>123<br>"

trim_posts([aaaaaaaaaa","bb","ab","cd"],3)
returns: "bb<br>ab<br>cd<br>"
	 */
	  public StringBuilder trim_posts(String[] r,int size) 
	  {
	      StringBuilder stb = new StringBuilder();
		    for(int i = 0; i < r.length; i++) {
		    	if(r[i].length() <= size) {
		    		stb.append(r[i]).append("<br>");
		    	}
		    }
		    return stb;
	  }
	  
	  public static void main(String[] args)
	  {
		  exampleSB03 m = new exampleSB03();
	    
	    String[]  arr = new String[]{"abcde","12345678","a very long post"};
	    
	    StringBuilder tst = m.trim_posts(arr,9);
	    System.out.print(tst);

	   
	    
	  }//end main
}
