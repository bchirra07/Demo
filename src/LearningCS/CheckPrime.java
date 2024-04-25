package LearningCS;

public class CheckPrime {

	public static void main(String[] args) {
		int num = 7;
		boolean check = false;
		for (int x = 2; x < num/2; x++) {
			if (num % x == 0) {
				check = true;
			}
		}
		if (check == true) {
			System.out.println(num + " is not a prime number");
		}else {
			System.out.println(num + " is a prime number");
		}

	}

}
