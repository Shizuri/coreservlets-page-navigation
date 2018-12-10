package abc;

import java.util.Random;

public class AbcController {
	
	public String go() {
		Random random = new Random();
		int odds = random.nextInt(2);
		if(odds == 1) {
			return "good";
		}
		return "bad";
	}
/*
	public String goA() {
		Random random = new Random();
		int odds = random.nextInt(2);
		if(odds == 1) {
			return "b-response";
		}
		return "defeat-response";
	}
	
	public String goB() {
		Random random = new Random();
		int odds = random.nextInt(2);
		if(odds == 1) {
			return "c-response";
		}
		return "defeat-response";
	}
	
	public String goC() {
		Random random = new Random();
		int odds = random.nextInt(2);
		if(odds == 1) {
			return "victory-response";
		}
		return "defeat-response";
	}
*/
	
}
