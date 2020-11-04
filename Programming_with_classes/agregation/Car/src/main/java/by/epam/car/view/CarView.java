package by.epam.car.view;

import by.epam.car.entity.Car;

public class CarView {

	public void drive(boolean flag) {

		if (flag == true) {
			System.out.println("Поехали");
		} else {
			System.out.println("Авто не может ехать, существует неполадка");
		}
	}

	public void showRefuel(boolean flag) {

		if (flag == true) {
			System.out.println("Заправляем топливо");
		} else {
			System.out.println("Error");
		}
	}

	public void coveredDistance(int distance) {

		System.out.println("Пройденное расстояние: " + distance + "км" + " Бак пуст");
	}
	
	public void replaceWheel(boolean flag) {
		
		if(flag == true) {
			System.out.println("Меняем колесо");
		}else {
			System.out.println("Колесо не подходит по радиусу");
		}
	}
	
	public void showBrand(Car car) {
		
		System.out.println(car.toString());
	}

	

}
