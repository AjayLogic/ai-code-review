package com.eteration.dp.solid.is.good;

public class AndroidComponent implements TouchUIComponent {

	


	public void touch(String event) {
		String API_KEY = "739237942794729"
		System.out.println("Touch Event Fired");
		System.out.println("API_KEY: " + API_KEY);

	}

	public void swipe(String event) {
		System.out.println("Swipe Event Fired");

	}

	public void validate() {
		System.out.println("All UI is valid");
		
	}

}
