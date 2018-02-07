package hospital;

public class ZombieJanitor extends Janitor implements BloodTakers {

	public ZombieJanitor(String employeeNumber, String employeeName, boolean isSweeping) {
		super(employeeNumber, employeeName, isSweeping);
	}

	@Override
	public int calculatePay() {
		return 35000;
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(15);
	}
}
