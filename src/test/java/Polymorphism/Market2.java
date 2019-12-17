package Polymorphism;

public class Market2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food f=new Apple();
		f.showFood();
		Apple ff1=(Apple)f;//===>this is downcasting
		
		Organic or=ff1;//this happens when you create //Food f=new Apple()// too. You are upcasting object apple to food class.
		
		
		Apple a =new Apple();
		a.appleMethod();
		
		
		
	}

}
