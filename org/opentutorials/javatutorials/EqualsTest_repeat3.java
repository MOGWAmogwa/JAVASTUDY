package java_repeat;

public class EqualsTest_repeat3 {

	public static void main(String[] args) {
		IdCard HONGHYEBIN = new IdCard(16012033);
		IdCard HYEBIN_HONG = new IdCard(16012033);
		
		if(HONGHYEBIN == HYEBIN_HONG)
			System.out.println(HONGHYEBIN == HYEBIN_HONG);
		else
			System.out.println(HONGHYEBIN != HYEBIN_HONG);
		
		if(HONGHYEBIN.equals(HYEBIN_HONG))
			System.out.println(HONGHYEBIN == HYEBIN_HONG);
		else
			System.out.println(HONGHYEBIN != HYEBIN_HONG);
		
			
		

	}

}


class IdCard {
	
	long id ;
	
	IdCard(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof IdCard) {
			return this.id == ((IdCard)obj).id;
		} else {
			return false;
		}
	
	}
}