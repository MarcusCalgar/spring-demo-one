package com.luv2code.springdemo;

public class FitnessCoach implements Coach {

	private FortuneService fortuneService;

	public FitnessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do a 30 min cardio workout";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
