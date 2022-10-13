package reservation_system_repeat8;

public class Seat {

	String name; 
	
	Seat(){
		name = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public boolean isOccupied() {
		if(name != null) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
