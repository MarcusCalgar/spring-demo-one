package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {}

	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void initializer() {
		System.out.println("TrackCoach: inside initializer method");		
	}
	
	//add a destroy method
	public void destroyer() {
		System.out.println("TrackCoach: inside destroyer method");		
	}
}
