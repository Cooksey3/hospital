package hospital;

public class EmergencyDispatcher extends Employee implements BloodTakers, MedicalDuties {

	private boolean isDrivingAmbulance;
	private boolean isTalking;

	public EmergencyDispatcher(String employeeNumber, String employeeName, boolean isDrivingAmbulance,
			boolean isTalking) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.isDrivingAmbulance = isDrivingAmbulance;
		this.isTalking = isTalking;
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);

	}

	@Override
	public int calculatePay() {
		return 45000;
	}

	public boolean isTalking() {
		return isTalking;
	}

	public boolean isDrivingAmbulance() {
		return isDrivingAmbulance;
	}
	
	@Override
	public String toString() {
		return employeeName + "\t|" + employeeNumber + "\t|" + isTalking + "\t|" + isDrivingAmbulance;
	}

	@Override
	public void administerCare(Patient patient) {
		patient.addHealth(7);
	}

}
