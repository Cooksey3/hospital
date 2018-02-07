package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();

	public void addEmployee(Employee employee) {
		employees.put(employee.getEmployeeNumber(), employee);
	}

	public void fireEmployee(Employee employee) {
		employees.remove(employee.employeeNumber);
	}
	
	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	public void showPayRates() {
		for (Employee employee : employees.values()) {
			System.out.println(employee.getEmployeeName() + " " + employee.payInfo());
		}
	}

	public void showAllMedicalPersonnel() {
		for (Employee employee : employees.values()) {
			if (employee instanceof MedicalDuties) {
				System.out.println(employee);
			}
		}
	}
	
	public void showBloodTakingPersonnel() {
		for (Employee employee : employees.values()) {
			if (employee instanceof BloodTakers) {
				System.out.println(employee);
			}
		}
	}
	
	public void printStaffInfo() {
		for(Employee employee : employees.values()) {
			System.out.println(employee.toString());
		}
	}
	
	public void showAllAdministrativePersonnel() {
		for (Employee employee : employees.values()) {
			if (!(employee instanceof BloodTakers)) {
				System.out.println(employee);
			}
		}
	}

}
