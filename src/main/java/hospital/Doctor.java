package hospital;

public class Doctor extends Employee implements MedicalDuties {

	public Doctor(String employeeNumber, String employeeName) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
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

}
