package q5;

public class CountStringBinary {

	public static int countStringBinary(int n) {
		
		if (n==1) {
			return 2;
		}
		if (n==2) {
			return 3;
		}
		return countStringBinary(n-1)+countStringBinary(n-2);
	}
	public static void main(String[] args) {
		
		int n = 4;
		if (n>0) {
		System.out.println(countStringBinary(n));
		} 

	}

}
