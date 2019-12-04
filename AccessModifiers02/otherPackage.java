package AccessModifiers02;

import AccessModifiers01.student;

public class otherPackage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student student=new student();
		 
		student.nameStudent="Mike";
		//student.ssn private
		//student.age=27; is protected so in different package it can not be used directly. It can be used as subclass.
		
		ohioStudent ohioStu = new ohioStudent();
		
		
		
	}
}
