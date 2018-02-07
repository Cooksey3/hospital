package hospital;

public class Doctor extends Employee implements MedicalDuties {

	protected String specialty;

	public Doctor(String employeeNumber, String employeeName, String specialty) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.specialty = specialty;
	}

	@Override
	public int calculatePay() {
		return 90000;
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);
	}

	@Override
	public void administerCare(Patient patient) {
		patient.addHealth(10);
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public String toString() {
		return employeeName + "\t|" + employeeNumber + "\t|" + specialty + "\t|";
	}
}