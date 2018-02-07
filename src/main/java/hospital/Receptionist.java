package hospital;

public class Receptionist extends Employee {

	private boolean isOnThePhone = true;

	public Receptionist(String employeeNumber, String employeeName, boolean isOnThePhone) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.isOnThePhone = isOnThePhone;
	}

	@Override
	public int calculatePay() {
		return 45000;
	}

	public boolean isOnThePhone() {
		return isOnThePhone;
	}

	@Override
	public String toString() {
		return employeeName + "\t|" + employeeNumber + "\t|" + isOnThePhone;
	}
}