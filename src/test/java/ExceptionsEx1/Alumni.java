package ExceptionsEx1;

public class Alumni {
	public static void main(String [] args) {
		//throws is also kind of declaration exception. Real handling is try catch block. 
		//Throws is not real handling. It is declaration but makes run exception.
	
Person p = new Person();
		
		try {
			p.setName("john smoke");
			p.setAge(-45);
		} catch (InvalidAgeException e) {
			System.out.println("age problem here");
		}
		
		System.out.println("Age is: " + p.getAge());
		try {
			p.eat("apple");
			p.eat("orange");
		}
		catch(AppleException e) {
			System.out.println("Cannot eat apple");
		}
		
	}



	}


