package q7;

import java.io.IOException;


public class InfixToPostfix 
{
	private MyStack myStack;
	private String input;
	private String output = "";
	
	public String doTrans(String infix) 
	{
		input = infix;
		int stackSize = input.length();
		myStack = new MyStack(stackSize);
		for (int j = 0; j < input.length(); j++) {
		char ch = input.charAt(j);
		switch (ch) {
			case '+':
			case '-':
				getOper(ch, 1);
				break;
			case '*':
			case '/':
				getOper(ch, 2);
				break;
			case '(':
				myStack.push(ch);
				break;
			case ')':
				getParen(ch);
				break;
			default:
				output = output + ch;
				break;
		}
		}
		
		while (!myStack.isEmpty()) 
		{
			output = output + myStack.pop();
		}
		//System.out.println(output);
		return output;
	}
	
	public void getOper(char opThis, int prec1) 
	{
		while (!myStack.isEmpty()) 
		{
			char opTop = myStack.pop();
			if (opTop == '(') 
			{
				myStack.push(opTop);
				break;
			} 
			else 
			{
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1) {
					myStack.push(opTop);
					break;
			}
				else output = output + opTop;
			}
		}
		myStack.push(opThis);
	}
	
	public void getParen(char ch) 
	{
		while (!myStack.isEmpty()) 
		{
			char chx = myStack.pop();
			if (chx == '(')
				break;
			else 
				output = output + chx;
		}
	}

	public static void main(String[] args) throws IOException 
	{
		//String output;
		InfixToPostfix ip1 = new InfixToPostfix();
		System.out.println("Postfix is " + ip1.doTrans("(4 + 8 * 6 - 5 / 3 - 2 * 2 + 2)") );
	}

class MyStack 
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public MyStack(int max) 
	{
		maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) 
	{
		stackArray[++top] = j;
	}
	
	public char pop()
	{
		return stackArray[top--];
	}
	
	public char peek() 
	{
		return stackArray[top];
	}
	
	public boolean isEmpty() 
	{
		return (top == -1);
	}
}
}