package q1;

import java.util.Stack;

public class TowersOfHanoi {
	
	static Stack<String> operations = new Stack<String>();

	public static void main(String[] args) {
		
		int n = 6; // 6 disks
		String source = "Source";
		String destination = "Destination";
		String aux = "temp";
		String str = String.format("towersOfHanoi(%d, %s, %s, %s)",n, source, aux, destination);
		operations.push(str);
		System.out.println("push "+str);
		towersOfHanoi(n, source, destination, aux);

	}

	private static void towersOfHanoi(int n, String source, String destination, String aux) {
		if(n==1) {
			
			System.out.println("Move "+n+" disk from "+source+" to "+destination);
			//pop the operation since the program exits here
			System.out.println("pop "+operations.pop());
		    
			
		}
		else {
			//push the operation since we are making a recursive call
			String str = String.format("towersOfHanoi(%d, %s, %s, %s)",n-1, source, aux, destination);
			operations.push(str);
			System.out.println("push "+str);
			towersOfHanoi(n-1, source, aux, destination);
			
			
			System.out.println("Move disk "+n+" from "+source+" to "+destination);
			
			//push the operation since we are making a recursive call
			String str1 = String.format("towersOfHanoi(%d, %s, %s, %s)",n-1, aux, destination, source);
			operations.push(str1);
			System.out.println("push "+str1);
			
			towersOfHanoi(n-1, aux, destination, source);
			// pop the operation since the program exits here
			System.out.println("pop "+operations.pop());

		}
		
	}

}
