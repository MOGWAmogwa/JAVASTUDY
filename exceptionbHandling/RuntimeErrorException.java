package exceptionbHandling;

public class RuntimeErrorException {

	public static void main(String[] args) {
		throw new RuntimeException();

	}

}


/*
 * 
 * 이 예제는 예외처리를 하지 않았음에도 불구하고 이전의 예제와는 달리 성공적으로 컴파일 할 것이다. 
 * 
 * 그러나 실행하면 RuntimeException 이 발생하여 비정상적으로 종료될 것이다. 
 * 
 * RuntiemException은 프로그래머에 의해 실수로 발생하는 것들이기 때문에 에외처리를 강제하지 않는다. */
 */