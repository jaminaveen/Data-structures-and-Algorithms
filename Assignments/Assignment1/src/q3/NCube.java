package q3;

public class NCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		int count = 0;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				for (int l = 0; l < n; l++) {
					count++;
					System.out.println(count);
				}
			}
		}

	}

}
