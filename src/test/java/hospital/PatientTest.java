package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {

	@Test
	public void shouldBeAbleToRemoveBlood() {
		Patient patient = new Patient();
		patient.removeBlood(3);
		int currentBloodLevel = patient.getBloodLevel();
		assertThat(currentBloodLevel, is(Patient.DEFAULT_BLOOD_LEVEL - 3));
	}

	@Test
	public void shouldBeAbleToAddHealth() {
		Patient patient = new Patient();
		patient.addHealth(10);
		int currentHealth = patient.getHealthLevel();

		assertThat(Patient.DEFAULT_HEALTH_LEVEL + 10, is(currentHealth));
	}
}
