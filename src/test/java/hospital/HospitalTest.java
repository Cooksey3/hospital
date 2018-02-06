package hospital;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

	@Test
	public void shouldAddEmployee() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("", "", "");
		hospital.addEmployee(doctor);

		Collection<Employee> check = hospital.getAllEmployees();

		assertThat(check, contains(doctor));
	}

	@Test
	public void shouldAddTwoEmployees() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("111", "", "");
		Nurse nurse = new Nurse("112", "");
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);

		Collection<Employee> check = hospital.getAllEmployees();

		assertThat(check, containsInAnyOrder(doctor, nurse));
	}

	@Test
	public void shouldRemoveEmployees() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("111", "", "");

	}

}
