package by.epam.car.entity;

public class Engine {

	private int power;
	private String fuel;
	private int volume;
	private int fuelConsumption;

	public Engine() {

	}

	public Engine(int power, String fuel, int volume, int fuelConsumption) {
		this.power = power;
		this.fuel = fuel;
		this.volume = volume;
		this.fuelConsumption = fuelConsumption;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		result = prime * result + fuelConsumption;
		result = prime * result + power;
		result = prime * result + volume;
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
		Engine other = (Engine) obj;
		if (fuel == null) {
			if (other.fuel != null)
				return false;
		} else if (!fuel.equals(other.fuel))
			return false;
		if (fuelConsumption != other.fuelConsumption)
			return false;
		if (power != other.power)
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", fuel=" + fuel + ", volume=" + volume + ", fuelConsumption="
				+ fuelConsumption + "]";
	}

}
