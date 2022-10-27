package zookeeper;

public abstract class Mammal {
	private int energyLevel;
	
	public int displayEnergy() {
		System.out.println("The mammals enery level is " + energyLevel + "!");
		return this.energyLevel;
	}
	
	public void setEnergy(int energyAmmount) {
		energyLevel = energyAmmount;
	}
	
	public void changeEnergy(int change) {
		this.energyLevel += change;
	}
}


