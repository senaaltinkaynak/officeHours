package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a =new Apple();
		a.fruitMethod();
		a.appleMethod();
		
		Fruit f=new Apple();
		
		f.fruitMethod();
		
		((Apple)f).appleMethod();
		
		
		List<Apple> apples=new ArrayList();
		apples.add(a);
		Orange o=new Orange();
		
		System.out.println("=========================================================");
		List<Fruit> fruits=new ArrayList();//===>polymorphic array
		fruits.add(o);
		fruits.add(a);
		fruits.add(f);
		
		for(Fruit ff:fruits) {
			ff.fruitMethod();
		}
		System.out.println("****************************************************************");
		Organic or=new Apple();
		//or.organicMethod();
		or.eat();
		
		/**
		 *    	food
		 *        |		Organic
		 *    	fruit	|
		 *Orange_| |_Apple
		 *
		 *		on left side (which is reference type) we can have food, fruit and organic while Apple is on rigth side.  
		 *     
		 */
	}

}
