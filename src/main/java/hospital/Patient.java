package hospital;

public class Patient {

	private int bloodLevel = 50;
	
	public int getBloodLevel() {
		return bloodLevel;
	}

	public void removeBlood(int amount) {
		bloodLevel -= amount;
		
	}


}
