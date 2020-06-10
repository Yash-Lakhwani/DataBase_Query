
public class employees {
	
	private int employeeNumber;
	private String lastName; 
	private String firstName; 
	private String extension; 
	private String email; 
	private String officeCode; 
	
	private int reportsTo;
	private String jobTitle;
	
	public employees() {
		super();
	}
	
	public employees(int employeeNumber, String lastName,String firstName,String extension,String email,String officeCode,int reportsTo,String jobTitle) {
		super();
		this.employeeNumber=employeeNumber;
		this.lastName=lastName;
		this.firstName=firstName;
		this.extension=extension;
		this.email=email;
		this.officeCode=officeCode;
		this.reportsTo=reportsTo;
		this.jobTitle=jobTitle;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getExtension() {
		return extension;
	}

	public String getEmail() {
		return email;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public int getReportsTo() {
		return reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	

}
