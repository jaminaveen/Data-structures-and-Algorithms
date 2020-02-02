package q6;

import java.util.Stack;

public class PostfixEvaluation
{
	public static int evaluation_postfix(String exp)
	{
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < exp.length(); i++)
			{
				char c = exp.charAt(i);
				if(c == ' ')
					continue;
				else if(Character.isDigit(c))
				{
					int n = 0;
					while(Character.isDigit(c))
					{
						n = n*10 + (int)(c-'0');
						i++;
						c = exp.charAt(i);
					}
					i--;
				
					stack.push(n);
				}
				else
				{
					int value1 = stack.pop();
					int value2 = stack.pop();
				switch(c)
				{
				case '+':
					stack.push(value2+value1);
					break;
				case '-':
					stack.push(value2- value1);
					break;
				case '/':
					stack.push(value2/value1);
					break;
				case '*':
					stack.push(value2*value1);
					break;
				}
				}
	}
		return stack.pop();
	}
	
	public static void main(String[] args)
	{
		String exp = "1 2 20 5/*+ "; 
		System.out.println(evaluation_postfix(exp));
		exp = "1  3 + 4  2/  8  4* *+ "; 
		System.out.println(evaluation_postfix(exp));
		exp = "4  8+  6  5-* 3  2-  2  2+* /"; 
		System.out.println(evaluation_postfix(exp));
	
	}
}