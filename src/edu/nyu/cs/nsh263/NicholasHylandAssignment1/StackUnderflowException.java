package edu.nyu.cs.nsh263.NicholasHylandAssignment1;


public class StackUnderflowException extends Throwable{

	public StackUnderflowException() {
	}
	
	public StackUnderflowException(String message){
		super(message);
	}
}
