package StringBuilders;

public class exampleSB {
	
	/*
	 * toBe gets a StringBuilder object that holds two booleans as a string separated by a comma ",".
for example "false,false". what you need to do is convert it to a string, spit the string by ","

.split(",");

Then use below table to determine if method needs to return boolean true or false depending on the values of StringBuilder object.


method use example:

toBe(StringBuilder("true,false"))
returns true

toBe(StringBuilder("true,true"))
returns true

toBe(StringBuilder("false,true"))
returns true

toBe(StringBuilder("false,false"))
returns false
	 */
	public boolean toBe(StringBuilder r) {

		String word = r.toString();
		String[] str = word.split(",");
		if (str[0].equals("false") && str[1].equals("false")) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		exampleSB m = new exampleSB();

		StringBuilder bool = new StringBuilder("true,false");

		boolean tst = m.toBe(bool);
		System.out.print(tst);

	}// end main
}
