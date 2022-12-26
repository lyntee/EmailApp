
public class Employee {

	private String firstName = "John";
	private String lastName = "Doe";
	private String dept = "NA";
	private String email = "NA";
	private String pw = "pw";
	private int mailBoxCapacityInGB = 50;
	private String altEmail = "NA";

	public Employee(String firstName, String lastName, String dept) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName != null || firstName != "") {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName != null || lastName != "") {
			this.lastName = lastName;			
		}
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		if (dept != null || dept != "") {
			this.dept = dept;			
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null || email != "") {
			this.email = email;			
		}
	}

	public int getMailBoxCapacityInGB() {
		return mailBoxCapacityInGB;
	}

	public void setMailBoxCapacityInGB(int mailBoxCapacityInGB) {
		if (mailBoxCapacityInGB > 0) {
			this.mailBoxCapacityInGB = mailBoxCapacityInGB;			
		}
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		if ((pw != null || pw != "") && pw.length() > 7) {
			this.pw = pw;			
		}
	}

	public String getAltEmail() {
		return altEmail;
	}

	public void setAltEmail(String altEmail) {
		if (altEmail != null || altEmail != "") {
			this.altEmail = altEmail;			
		}
	}

	
}
