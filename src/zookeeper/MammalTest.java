package zookeeper;

public class MammalTest {

	public static void main(String[] args) {

		GiantBat b = new GiantBat();
		
		b.fly(2);
		b.displayEnergy();
		
		b.eatHumans(2);
		b.displayEnergy();
		
		b.attackTown(3);
		b.displayEnergy();
	}

}
