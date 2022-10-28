package reservation_system_repeat10;

public class Seat {
	
	String name;
	
	Seat(){
		this.name = null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOccupied() {
		if(name != null) {
			return true;
		} else {
			return false;
		}
	}
	
}
