package by.epam.car.entity;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

	private List<Wheel> wheels;
	private Engine engine;
	private String brand;
	private String color;
	private int yearOfManufacture;
	private int capacityOfTank;
	private int currentAmountFuel;

	public Car() {

	}

	public Car(List<Wheel> wheels, Engine engine, String brand, String color, int yearOfManufacture, int capacityOfTank,
			int currentAmountFuel) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.brand = brand;
		this.color = color;
		this.yearOfManufacture = yearOfManufacture;
		this.capacityOfTank = capacityOfTank;
		this.currentAmountFuel = currentAmountFuel;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public int getCapacityOfTank() {
		return capacityOfTank;
	}

	public void setCapacityOfTank(int capacityOfTank) {
		this.capacityOfTank = capacityOfTank;
	}

	public int getCurrentAmountFuel() {
		return currentAmountFuel;
	}

	public void setCurrentAmountFuel(int currentAmountFuel) {
		this.currentAmountFuel = currentAmountFuel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + capacityOfTank;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + currentAmountFuel;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		result = prime * result + yearOfManufacture;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (capacityOfTank != other.capacityOfTank)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (currentAmountFuel != other.currentAmountFuel)
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		if (yearOfManufacture != other.yearOfManufacture)
			return false;
		return true;
	}
	
	

	// метод для расчета расстояния

	@Override
	public String toString() {
		return brand;
	}

	public int distance(double currentAmountFuel, double fuelConsumption) {

		int distance;

		distance = (int) (currentAmountFuel / fuelConsumption * 100);

		return distance;
	}

	public boolean go(Car car) {

		int count = 0;
		boolean flag = false;

		for (int i = 0; i < car.getWheels().size() - 1; i++) {

			if (car.getWheels().get(i).getRadius() == car.getWheels().get(i + 1).getRadius()) {
				count++;
			}
		}

		if (count == 3 && car.getWheels().size() == 4
				&& (currentAmountFuel > 0 && currentAmountFuel <= capacityOfTank)) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;

	}

	public boolean refuel(int currentAmountFuel) {

		boolean flag = false;

		if (currentAmountFuel >= 0 && currentAmountFuel < capacityOfTank) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

	public boolean wheelReplacement(Wheel wheel, Car car, int indexOfWheel) {

		boolean flag = false;

		if (wheel.getRadius() == car.getWheels().get(indexOfWheel).getRadius()) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;

	}

}
