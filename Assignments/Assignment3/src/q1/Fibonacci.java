package q1;

import java.util.Stack;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n = 6;
		int recursiveResult = recursiveFibonacci(n);
		System.out.format("recursiveResult of fib(6) is %d\n",recursiveResult);
		
		int iterativeResult = iterativeFibonacci(n);
		System.out.format("iterativeResult of fib(6) is %d",iterativeResult);
		

	}

	public static int recursiveFibonacci(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
	
	public static int iterativeFibonacci(int n) {
		int a = 0;
		int b = 1;
		for(int i = 1;i<n;i++) {
			int temp = a;
			a = b;
			b = temp + a;
		}
		return b;
	}

}
