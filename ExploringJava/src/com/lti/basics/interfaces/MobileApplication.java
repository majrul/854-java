package com.lti.basics.interfaces;

// - single line comment
/*
 * multi line comment
 * multi line comment
 */
/**
 * multi line javadoc comment
 * This interface contains the contract for any mobile app to be developed.
 * @author Google Inc
 */
public interface MobileApplication {

	public String INFO = "Developed by Google (c) 2020";
	
	public void start();
	public void pause();
	public void stop();
	
	//From Java 8 onwards, we can also have non-abstract,abstract methods as well in an interface
	public default void init() {
		TaskManager.add(this);
	}
	
	public static void info() {
		System.out.println(INFO);
	}
}
