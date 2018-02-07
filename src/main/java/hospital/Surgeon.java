package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating = false;

	public Surgeon(String employeeNumber, String employeeName, String specialty, boolean isOperating) {
		super(employeeNumber, employeeName, specialty);
		this.isOperating = isOperating;
	}

	@Override
	public int calculatePay() {
		return 120000;
	}

	public boolean isOperating() {
		Patient patient = new Patient();
		if (patient.getHealthLevel() < 10) {
			return true;
		}
		return isOperating;
	}

	@Override
	public String toString() {
		return employeeName + "\t|" + employeeNumber + "\t|" + specialty + "\t|" + isOperating;
	}
}
