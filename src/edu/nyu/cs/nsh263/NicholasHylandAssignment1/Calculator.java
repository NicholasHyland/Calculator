package edu.nyu.cs.nsh263.NicholasHylandAssignment1;

import java.util.StringTokenizer;
import java.lang.Math;

public class Calculator {
	
	float result;
	String answer = "";
	
	public Calculator(String expression) throws StackOverflowException, StackUnderflowException, InFixException {
		
		Converter inFixExpression = new Converter(expression);
		String postFixExpression = inFixExpression.toPostFix();
		
		ArrayStack stack = new ArrayStack();
		
		String operand1;
		String operand2;
		
		this.result = 0;
		
		String token;
		
		StringTokenizer tokenizer = new StringTokenizer(postFixExpression, ".");
		
		while (tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();
			if (isNotOperator(token))
				stack.push(token);
			else {
				switch (token) {
					case "+":
						operand2 = stack.top();
						stack.pop();
						operand1 = stack.top();
						stack.pop();
						this.result = Float.parseFloat(operand1) + Float.parseFloat(operand2);
						this.answer += result;
						stack.push(this.answer);
						this.answer = "";
						break;
					case "-":
						operand2 = stack.top();
						stack.pop();
						operand1 = stack.top();
						stack.pop();
						this.result = Float.parseFloat(operand1) - Float.parseFloat(operand2);
						this.answer += result;
						stack.push(this.answer);
						this.answer = "";
						break;
					case "*":
						operand2 = stack.top();
						stack.pop();
						operand1 = stack.top();
						stack.pop();
						this.result = Float.parseFloat(operand1) * Float.parseFloat(operand2);
						this.answer += result;
						stack.push(this.answer);
						this.answer = "";
						break;
					case "/":
						operand2 = stack.top();
						stack.pop();
						operand1 = stack.top();
						stack.pop();
						this.result = Float.parseFloat(operand1) / Float.parseFloat(operand2);
						this.answer += result;
						stack.push(this.answer);
						this.answer = "";
						break;
					case "^":
						operand2 = stack.top();
						stack.pop();
						operand1 = stack.top();
						stack.pop();
						this.result = (float) Math.pow(Float.parseFloat(operand1), Float.parseFloat(operand2));
						this.answer += result;
						stack.push(this.answer);
						this.answer = "";
						break;
					case ".":
						break;
					}
				}
			}	
		this.result = Float.parseFloat(stack.top());
		stack.pop();
		}
	
	public float getAnswer() {
		return (float)this.result;
	}
	
	public static boolean isNotOperator(String test) {
		if (test.equals("/") || test.equals("*") || test.equals("-") || test.equals("+") || test.equals("^") ||
				test.equals("(") || test.equals(")") || test.equals("{") || test.equals("}") || test.equals("."))
			return false;
		else
			return true;
	}
}
