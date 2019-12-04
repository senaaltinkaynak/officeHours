package AccessModifiers01;

public class student {
	public String nameStudent;
	private int ssnStudent;
	protected int ageStudent;
	String campusStudent;
	private int studentValuePrivateID01;
	protected int studentValueProtectedID02;
	int studentValueDefaultID03;
	public int studentValuePublicID04;
	
	public void publicMethodStudent() {
		System.out.println("Bu bir student public metotdur");
	}

	void defaultMethodStudent() {
		System.out.println("Bu bir student default metotdur");
	}

	protected void protectedMethodStudent() {
		System.out.println("Bu bir student protected metotdur");
	}

	private void privateMethodStu() {
		System.out.println("Bu bir student private metotdur");
	}
}
