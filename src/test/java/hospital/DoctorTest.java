package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("1111", "Phil", "Brain");

	@Test
	public void shouldDrawBlood() {
		Patient patient = new Patient();

		int bloodBefore = patient.getBloodLevel();

		underTest.drawBlood(patient);

		int bloodAfter = patient.getBloodLevel();
		assertThat(bloodBefore - bloodAfter, is(3));
	}

	// boolean wasBled = false;
	//
	// public class BleedableDouble implements Bleedable {
	// @Override
	// public void removeBlood(int amount) {
	// wasBled = true;
	// }
	//
	// }
	//
	// @Test
	// public void shouldDrawBloodFromTestDouble() {
	// Doctor underTest = new Doctor();
	// Bleedable patient = new BleedableDouble();
	//
	// underTest.drawBlood(patient);
	//
	// assertThat(wasBled, is(true));
	// }

	@Test
	public void shouldHaveSalary() {

		int salary = underTest.calculatePay();

		assertThat(salary, is(90000));
	}

	@Test
	public void shouldTreatPatients() {
		Patient patient = new Patient();

		int healthBefore = patient.getHealthLevel();

		underTest.administerCare(patient);

		int healthAfter = patient.getHealthLevel();
		assertThat(healthAfter - healthBefore, is(10));
	}

	@Test
	public void shouldReturnEmployeeNumber() {
		String check = underTest.getEmployeeNumber();
		assertEquals(check, "1111");
	}

	@Test
	public void shouldReturnEmployeeName() {
		String check = underTest.getEmployeeName();
		assertEquals(check, "Phil");
	}
	
	@Test
	public void shouldReturnDoctorSpecialty() {
		String check = underTest.getSpecialty();
		assertEquals(check, "Brain");
	}
}