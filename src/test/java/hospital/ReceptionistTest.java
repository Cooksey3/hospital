package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist underTest = new Receptionist("", "", true);

	@Test
	public void shouldHaveSalary() {
		int salary = underTest.calculatePay();
		assertThat(salary, is(45000));
	}

	@Test
	public void shouldBeOnThePhone() {
		boolean isTalking = underTest.isOnThePhone();
		assertThat(isTalking, is(true));
	}
}
