package com.lti.basics.interfaces;

/**
 * In-built launcher for launching any mobile app.
 * @author Google Inc
 */
public class Launcher {

	public void launch(MobileApplication mobileApp) {
		mobileApp.init();
		mobileApp.start();
		mobileApp.pause();
		mobileApp.stop();
	}
}
