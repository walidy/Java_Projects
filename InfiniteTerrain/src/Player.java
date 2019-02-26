
public class Player {

	private String name;
	private int health;
	private int strength;
	private int xPosition;
	private int yPosition;

	public Player(String name, int health, int strength, int xPosition, int yPosition) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public void setXPoisition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getXPosition() {
		return xPosition;
	}

	public void setYPoisition(int yPosition) {
		this.yPosition = yPosition;
	}

	public int getYPosition() {
		return yPosition;
	}

}
