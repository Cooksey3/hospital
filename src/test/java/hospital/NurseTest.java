package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	MedicalDuties underTest = new Nurse("", "", 0);

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}

	}

	@Test
	public void shouldDrawBloodFromTestDouble() {

		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);

		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Nurse("", "", 0);

		int salary = underTest.calculatePay();

		assertThat(salary, is(50000));
	}

	@Test
	public void increasePatientHealth() {
		Patient patient = new Patient();

		int healthBefore = patient.getHealthLevel();

		underTest.administerCare(patient);

		int healthAfter = patient.getHealthLevel();
		assertThat(healthAfter - healthBefore, is(5));
	}
	
	@Test
	public void shouldHavePatients() {
		Nurse underTest = new Nurse ("", "", 20);
		int numberOfPatients = underTest.getNumberOfPatients();
		assertThat(numberOfPatients, is(20));
	}

}
