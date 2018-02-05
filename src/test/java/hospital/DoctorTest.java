package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
	
	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor();
		Patient patient = new Patient();

		int bloodBefore = patient.getBloodLevel();
		
		underTest.drawBlood(patient);
		
		int bloodAfter = patient.getBloodLevel();
		assertThat(bloodBefore = bloodAfter, is(1));
	}
}
