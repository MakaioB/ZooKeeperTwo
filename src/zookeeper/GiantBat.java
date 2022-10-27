package zookeeper;

public class GiantBat extends Mammal{
	
	public GiantBat() {
		setEnergy(300);
	}
	
	public void fly(int numTimesFlown) {
		for (int i = 0; i < numTimesFlown; i++) {
			changeEnergy(-50);			
		}
		System.out.println("Fwooosh");
	}
	
	public void eatHumans(int numHumansEaten) {
		for (int i = 0; i < numHumansEaten; i++) {
			changeEnergy(25);			
		}
		System.out.println("The Horror...");
	}
	
	public void attackTown(int numTownsAttacked) {
		for (int i = 0; i < numTownsAttacked; i++) {
			changeEnergy(-100);			
		}
		System.out.println("*Burning noises, crying, and screaming*");
	}
}
