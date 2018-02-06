package hospital;

public class HospitalApp {

	public static void main(String[] args) {

		Doctor phil = new Doctor("1111", "Phil", "Brain");
		Surgeon harry = new Surgeon("1112", "Harry", "Brain", true);
		Nurse jackie = new Nurse("1113", "Jackie");
		Receptionist rosie = new Receptionist("1114", "Rosie", true);

		Hospital hospital = new Hospital();

		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(rosie);

		System.out.println("Here are the pay rates at High St. Hospital:");
		hospital.showPayRates();

		System.out.println("Here are employees with medical duties: ");
		hospital.showAllMedicalPersonnel();

	}

}