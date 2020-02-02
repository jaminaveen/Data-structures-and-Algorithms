package q2;

class GrayCode {

	public static String G(int k , int n)
	{
		if (n == 1)
		{
			return new Integer(k).toString();
		}
		else if (k < (int)Math.pow(2,n-1))
		{
			return "0" + G(k, n - 1);
		}
		else 
		{
			return "1" + G((int)Math.pow(2,n) - 1 - k, n - 1);
		}
		}
	
	public static String[] graycode(int n)
	{
		String[] result = new String[(int)Math.pow(2,n)];
		
		for (int k = 0; k < (int)Math.pow(2,n); k++)
		{
			result[k] = G(k,n);
		}
		return result;
		}
	
		public static void main(String[] args) {
		String[] codes = graycode(4);
		for (int i = 0; i < codes.length; i++){
		System.out.println(codes[i]);
		}
		}

}