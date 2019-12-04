package AccessModifiers01;

public class campus {
	
	
	
	public static void main(String[] args) {
		student student1 =new student();
		
		student1.nameStudent="Selim";//public
//		student1.ssn ssn is private. Only visible in same class.
		student1.ageStudent=27;
		student1.campusStudent="New Jersey";
		

		//campus has a campusStudent
		campusStudent campusStudent=new campusStudent();
		student student =new student();
		
		int x = campusStudent.defaultCampusStudentBadgeID03;
	    int y = campusStudent.protectedCampusStudentBadgeID02;
	    int z = campusStudent.publicCampusStudentBadgeID04;
	    int k = campusStudent.studentValueDefaultID03;
	    int l = campusStudent.studentValueProtectedID02;
	    int m = campusStudent.studentValuePublicID04;
	    int n = campusStudent.privateCampusStudentBadgeID01();
	    campusStudent.defaultMethodCampusStudent();
	    campusStudent.defaultMethodStudent();
	    campusStudent.protectedMethodCampusStudent();
	    campusStudent.protectedMethodStudent();
	    campusStudent.publicMethodCampusStudent();
	    campusStudent.publicMethodStudent();

	    System.out.println("private degisken = " + campusStudent.privateCampusStudentBadgeID01());
	    campusStudent.setPrivateCampusStudentBadgeID01(3);
	    System.out.println("private degisken = " + campusStudent.privateCampusStudentBadgeID01());
	    
		
	}
}
