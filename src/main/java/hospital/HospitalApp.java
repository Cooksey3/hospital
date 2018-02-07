package hospital;

public class HospitalApp {

	public static void main(String[] args) {

		Doctor phil = new Doctor("1111", "Phil", "Brain");
		Surgeon harry = new Surgeon("1112", "Harry", "Brain", true);
		Nurse jackie = new Nurse("1113", "Jackie", 20);
		Receptionist rosie = new Receptionist("1114", "Rosie", true);
		Janitor jimmy = new Janitor("1115", "Jimmy", true);

		Hospital hospital = new Hospital();

		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(rosie);
		hospital.addEmployee(jimmy);

		System.out.println("Here are the current employees at High St. Hospital: ");
		System.out.println("Name\t|Emp. No|Status");
		System.out.println("--------|-------|-------");		
		hospital.printStaffInfo();
		System.out.println();

		System.out.println("Here are the pay rates at High St. Hospital:");
		hospital.showPayRates();
		System.out.println();

		System.out.println("Here are employees with medical duties: ");
		System.out.println("Name\t|Emp. No|Status");
		hospital.showAllMedicalPersonnel();
		
		


	}

}