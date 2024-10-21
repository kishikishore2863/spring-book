package com.kishi.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		Engine petrolEngine = new PetrolEngine();
		Car petrolCar = new Car(petrolEngine);
		petrolCar.startCar();  // Output: Petrol Engine started. Car is running.

		// Injecting DieselEngine into the car
		Engine dieselEngine = new DesielEngine();
		Car dieselCar = new Car(dieselEngine);
		dieselCar.startCar();  // Output: Diesel Engine started. Car is running.
	}


}
