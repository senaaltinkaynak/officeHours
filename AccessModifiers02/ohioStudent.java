package AccessModifiers02;

import AccessModifiers01.*;

import AccessModifiers01.campusStudent;

public class ohioStudent extends campusStudent {
	

	public static void main(String[] args) {
		
		campusStudent ali = new campusStudent();
		ohioStudent veli = new ohioStudent();
		veli.protectedMethodCampusStudent();
		
		int x = ali.publicCampusStudentBadgeID04;
		int m = ali.studentValuePublicID04;
		int y = veli.protectedCampusStudentBadgeID02;
		int z = veli.publicCampusStudentBadgeID04;
		int k = veli.studentValueProtectedID02;
		int l = veli.studentValuePublicID04;
		
	}
	
}
