package Interface;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		
		SVC svc = new SVC();
		svc.repair(dropship);
		


	}

}

interface Repairable{};

class GroundUnit extends _Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends _Unit{
	AirUnit(int hp){
		super(hp);
	}
}


class _Unit{
	int hitPoint;
	final int MAX_HP;
	_Unit(int hp){
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
			return "Tank";

	}

}

class Dropship extends AirUnit implements Repairable {
	Dropship(){
		super(125); // Tank 의 hp는 150이다. 
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";

	}
}

class Marine extends GroundUnit {
	Marine(){
		super(150); // Tank 의 hp는 150이다. 
		hitPoint = MAX_HP;
	}
}


class SVC extends GroundUnit implements Repairable {
	SVC(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof _Unit) {
			_Unit u = (_Unit)r;
			while (u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			
			System.out.println(u.toString()+" is gotten repaired.");
		}
		
	}
}
