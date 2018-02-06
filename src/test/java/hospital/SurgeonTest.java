package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	Surgeon underTest = new Surgeon("1111", "Joe", "Brain", false);

	@Test
	public void isOperate() {
		boolean operating = underTest.isOperating();
		assertThat(operating, is(false));
	}

	// @Test
	// public void shouldGoIntoSurgery() {
	// Patient patient = new Patient();
	// boolean isOperating = underTest.isOperating();
	// if (patient.getBloodLevel() < 51) {
	// isOperating = true;
	// }
	// assert(isOperating, is(underTest.isOperating()));
	//
	// }
}
