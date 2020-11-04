package by.epam.car.main;

import java.util.ArrayList;
import java.util.List;

import by.epam.car.entity.Car;
import by.epam.car.entity.Engine;
import by.epam.car.entity.Wheel;
import by.epam.car.view.CarView;

public class Main {

	public static void main(String[] args) {

		List<Wheel> wheels = new ArrayList<Wheel>();

		wheels.add(new Wheel(15, 195, 65));
		wheels.add(new Wheel(15, 195, 65));
		wheels.add(new Wheel(15, 195, 65));
		wheels.add(new Wheel(15, 195, 65));

		Wheel spareWheel = new Wheel(15, 195, 65);
		CarView view = new CarView();

		Engine engine = new Engine(110, "diesel", 1900, 7);

		Car car = new Car(wheels, engine, "Volkswagen", "gray", 2000, 55, 30);
		
		view.showBrand(car);

		boolean flag = car.go(car);
		view.drive(flag);

		if (flag == true) {

			int dist = car.distance(car.getCurrentAmountFuel(), engine.getFuelConsumption());
			view.coveredDistance(dist);

			car.refuel(0);

			view.showRefuel(flag);

		}

		flag = car.wheelReplacement(spareWheel, car, 1);
		view.replaceWheel(flag);

	}

}
