package hospital;

public class Nurse extends Employee implements MedicalDuties {

	public Nurse(String employeeNumber, String employeeName) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
	}

	@Override
	public int calculatePay() {
		return 50000;
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	@Override
	public void administerCare(Patient patient) {
		patient.addHealth(5);

	}

}
