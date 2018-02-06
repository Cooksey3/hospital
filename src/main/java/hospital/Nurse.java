package hospital;

public class Nurse extends Employee implements MedicalDuties {

	private int numberOfPatients;

	public Nurse(String employeeNumber, String employeeName, int numberOfPatients) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.numberOfPatients = numberOfPatients;
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

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

}
