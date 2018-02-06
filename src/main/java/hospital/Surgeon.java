package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String employeeNumber, String employeeName, String specialty, boolean isOperating) {
		super(employeeNumber, employeeName, specialty);
		this.isOperating = isOperating;
	}

	@Override
	public int calculatePay() {
		return 120000;
	}

	public boolean isOperating() {
		return isOperating;
	}
}
