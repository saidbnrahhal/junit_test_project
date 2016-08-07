package com.rahhal.training.proteintracker.exception;

@SuppressWarnings("serial")
public class InvalidGoalException extends Exception {

	public InvalidGoalException(String msg){
		super(msg);
	}
	
	public InvalidGoalException(){}
}
