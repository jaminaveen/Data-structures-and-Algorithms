package q3;

public class NSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		int sum = 0;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				sum += j * k;
				System.out.println(sum);
			}
		}

	}

}
