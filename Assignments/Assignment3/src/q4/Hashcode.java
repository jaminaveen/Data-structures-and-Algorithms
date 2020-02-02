package q4;

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hello= "Welcome Students to Class";
		double sum=0;
		for(int i=0;i<hello.length();i++)
		{
		char a = hello.charAt(i);
		int b =(int) a;
		double temp = b*Math.pow(31, hello.length()-1-i);
		sum=(double)sum+temp;
		}
		System.out.print("Total sum i.e, hashcode is: "+sum);
		}
	}

