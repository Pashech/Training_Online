package by.epam.time.time_main;

import by.epam.time.main.Time;

public class TimeMain {

	public static void main(String[] args) {

		Time time = new Time(00, 00, 00);
		System.out.println(time.toString());

		time.changeHour(1);
		time.changeMinutes(1);
		time.changeSeconds(30);
		

	}

}
