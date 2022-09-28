package reservation_system_repeat2;
import java.util.*;

public class Seat {
	
	public String name;
	
	Seat(){
		this.name = null;
	}

	public void reserveName(String name) {
		this.name = name;
	}
	
	public boolean isOccupied() {
		if(name == null)
			return false;
		else 
			return true;
	}
	
//	public void cancel() {
//		name = null;
//	}
	
//    public boolean match(String name) {
//        return (name.equals(name));
//    }
	
	public String getName() {
		return name;
	}
}
