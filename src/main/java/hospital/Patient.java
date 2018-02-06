package hospital;

public class Patient implements Bleedable {

	static final int DEFAULT_BLOOD_LEVEL = 50;
	static final int DEFAULT_HEALTH_LEVEL = 10;

	private int bloodLevel = DEFAULT_BLOOD_LEVEL;
	private int healthLevel = DEFAULT_HEALTH_LEVEL;

	public int getBloodLevel() {
		return bloodLevel;
	}

	@Override
	public void removeBlood(int amount) {
		bloodLevel -= amount;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void addHealth(int amount) {
		healthLevel += amount;
	}

}
