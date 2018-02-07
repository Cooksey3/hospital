package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ZombieJanitorTest {

	ZombieJanitor underTest = new ZombieJanitor("", "Bill", true);

	@Test
	public void shouldDrawBlood() {
		Patient patient = new Patient();

		int bloodBefore = patient.getBloodLevel();

		underTest.drawBlood(patient);

		int bloodAfter = patient.getBloodLevel();

		assertThat(bloodBefore - bloodAfter, is(15));

	}
	
	@Test
	public void shouldHaveSalary() {
		int salary = underTest.calculatePay();
		assertThat(salary, is(35000));
	}
	
	@Test
	public void shouldHaveName() {
		String name = underTest.getEmployeeName();
		assertThat(name, is("Bill"));
	}
}
