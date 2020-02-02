package q1;
import java.util.Stack;

public class Factorial {
	
	static Stack<String> operations = new Stack<String>();

	public static int factorial(int n) {
		if (n==1 || n==0) {
			System.out.println("base case reached - factorial(1): pop 1");
			return 1;
		}
		String str = String.format("%d x factorial(%d-1)",n,n);
		System.out.println("push "+str+" on the stack");
		operations.push(str);
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int result = factorial(n);
		while(!operations.isEmpty()) {
			String str = (String) operations.pop();
			System.out.println("pop "+str+" from the stack");
		}
		System.out.println("result is :"+result);

	}

}
