package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmergencyDispatcherTest {

	EmergencyDispatcher underTest = new EmergencyDispatcher("1111", "Tina", false, false);

	@Test
	public void shouldHaveMedicalDuties() {
		Patient patient = new Patient();
		int bloodLevelBefore = patient.getBloodLevel();

		underTest.drawBlood(patient);

		int bloodLevelAfter = patient.getBloodLevel();

		assertThat(bloodLevelBefore - bloodLevelAfter, is(3));

	}

	@Test
	public void shouldHaveSalary() {
		int salary = underTest.calculatePay();
		assertThat(salary, is(45000));
	}
	
	@Test
	public void shouldGetTalking() {
		boolean isTalking = underTest.isTalking();
		assertThat(isTalking, is(false));
	}
	
	@Test
	public void shouldGetDrivingAmbulance() {
		boolean isDrivingAmbulance = underTest.isDrivingAmbulance();
		assertThat(isDrivingAmbulance, is(false));
	}
	
	@Test
	public void shouldPrintEmployeeInfo() {
		String toStringInfo = underTest.toString();
		assertThat(toStringInfo, is(underTest.toString()));
	}
	
	@Test
	public void shouldCareForPatient() {
		Patient patient = new Patient();
		int healthLevelBefore = patient.getHealthLevel();
		
		underTest.administerCare(patient);
		
		int healthLevelAfter = patient.getHealthLevel();
		
		assertThat(healthLevelAfter - healthLevelBefore, is(7));
	}

}
