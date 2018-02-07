package hospital;

public abstract class Employee {

	protected String employeeNumber;
	protected String employeeName;

	public String payInfo() {
		return "'s salary is " + calculatePay();
	}

	public abstract int calculatePay();

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return employeeName + "\t" + employeeNumber;
	}

}
