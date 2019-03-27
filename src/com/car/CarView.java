package com.car;

public class CarView {
	
	public void view(Car car) {
		
		System.out.println("엔진 파워 : " + car.engine.hp);
		
		for(int i = 0; i < car.wheels.length; i++) {
			
			System.out.println("Wheel Color : " + car.wheels[i].color);
			System.out.println("Wheel size : " + car.wheels[i].size);
			
			
		}
		
		System.out.println("Car color : " + car.color);
		
	}

}
