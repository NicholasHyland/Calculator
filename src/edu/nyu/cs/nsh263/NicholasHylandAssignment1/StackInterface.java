package edu.nyu.cs.nsh263.NicholasHylandAssignment1;

public interface StackInterface {

	public void push(String item) throws StackOverflowException;
	
	public void pop() throws StackUnderflowException;
	
	public String top() throws StackUnderflowException;
	
	public boolean isEmpty();
	
	public boolean isFull();
}
