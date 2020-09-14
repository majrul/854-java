package com.lti.basics.interfaces;

public class App {

	public static void main(String[] args) {
		MobileApplication.info();
		//Math.PI
		//System.out.println(MobileApplication.INFO);
		Launcher launcher = new Launcher();
		MobileApplication app1 = new MyMobileApplication1();
		launcher.launch(app1);
	}
}
