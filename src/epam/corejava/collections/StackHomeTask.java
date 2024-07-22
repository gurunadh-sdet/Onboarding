package epam.corejava.collections;

import java.util.Scanner;
import java.util.Stack;

public class StackHomeTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the expressions to evaluate for balancing");
		while(scan.hasNextLine()) {
			String expression = scan.nextLine().trim();
			System.out.println(expression);
			System.out.println(isBalanced(expression));
		}
	}
		
	public static boolean isBalanced(String exp) {
		if(exp.isEmpty())
			return true;
		Stack stack = new Stack();
		char[] chars = exp.toCharArray();
		for(char c: chars) {
			if (c=='{' || c=='['||c=='('){
				stack.push(c);				
			}
			//at any point if stack is empty before we remove the symbol using pop return false;
			if(stack.isEmpty())
				return false;
			if (c=='}' || c==']'||c==')') {
				char ch =(char) stack.pop();
				if(!(ch ==getOpposite(c))) {
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}
	//to get the opposite expression of given symbol
	public static char getOpposite(char ch) {
		switch(ch) {
		case '}': return '{';
		case ']': return '[';
		case ')': return '(';
		default: return '0';
		}
	}
		
	}

