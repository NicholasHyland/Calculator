package edu.nyu.cs.nsh263.NicholasHylandAssignment1;

public class StackOverflowException extends Throwable{

	public StackOverflowException() {
	}
	
	public StackOverflowException(String message){
		super(message);
	}
}
