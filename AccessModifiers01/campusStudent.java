package AccessModifiers01;

public class campusStudent extends student {
	
private int privateCampusStudentBadgeID01;
protected int protectedCampusStudentBadgeID02;
int defaultCampusStudentBadgeID03;
public int publicCampusStudentBadgeID04;

public int privateCampusStudentBadgeID01() {
	return privateCampusStudentBadgeID01;
}

public void setPrivateCampusStudentBadgeID01(int privateCampusStudentBadgeID01) {
	this.privateCampusStudentBadgeID01 = privateCampusStudentBadgeID01 * 2;
}
/*
public void setPrivateCampusStudentBadgeID01(int x) {
	privateCampusStudentBadgeID01 = x;
}*/

public void publicMethodCampusStudent() {
	System.out.println("Bu bir public metotdur");
}

void defaultMethodCampusStudent() {
	System.out.println("Bu bir default metotdur");
}

protected void protectedMethodCampusStudent() {
	System.out.println("Bu bir protected metotdur");
}

private void privateMethodCampusStudent() {
	System.out.println("Bu bir private metotdur");
}

}