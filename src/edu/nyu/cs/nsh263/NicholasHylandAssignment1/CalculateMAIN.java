package edu.nyu.cs.nsh263.NicholasHylandAssignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateMAIN{

	public static void main(String[] args) throws InFixException, StackUnderflowException, StackOverflowException {
		
		String[] split;
		ArrayList<String> splitWithDelim = new ArrayList<String>();
		String finalExpression = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an Infix Expression to evaluate: ");
		String inFixExpression = input.nextLine();
		
		inFixExpression = inFixExpression.replaceAll(" ","");
		split = inFixExpression.split("");
		
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals("/") || split[i].equals("*") || split[i].equals("-") || split[i].equals("+") || split[i].equals("^") ||
				split[i].equals("(") || split[i].equals(")") || split[i].equals("{") || split[i].equals("}")) {
				splitWithDelim.add(".");
				splitWithDelim.add(split[i]);
				splitWithDelim.add(".");
			}
			else
				splitWithDelim.add(split[i]);
		}
		
		String[] splitWithDelim2 = new String[splitWithDelim.size()];
		
		splitWithDelim2 = splitWithDelim.toArray(splitWithDelim2);
		
		for (int i = 0; i < splitWithDelim2.length; i++) {
			finalExpression += splitWithDelim2[i];
		}
		
		System.out.println(finalExpression);
		
		Calculator calculate = new Calculator(finalExpression);
		
		System.out.println(inFixExpression + " = " + calculate.getAnswer());
		
	}

}
