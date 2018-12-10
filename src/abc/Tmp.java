package abc;

import java.util.Random;

public class Tmp {
	public static void main(String[] args) {
		Random r = new Random();
		//System.out.println(r.nextInt(10));
		for (int i = 0; i < 20; i++) {
			System.out.print(r.nextInt(2) + " ");
		}
	}
}
