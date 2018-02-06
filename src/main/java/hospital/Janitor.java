package hospital;

public class Janitor extends Employee {

	private boolean isSweeping = true;

	public Janitor(String employeeNumber, String employeeName, boolean isSweeping) {
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.isSweeping = isSweeping;

	}

	@Override
	public int calculatePay() {
		return 40000;
	}

	public boolean isSweeping() {
		return isSweeping;
	}

}
