package by.epam.time.main;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей 
(час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Time {

	private int hour;
	private int minute;
	private int second;

	public static final int MAX_VALUE_HOUR = 23;
	public static final int MAX_VALUE = 59;
	public static final int MIN_VALUE = 0;

	public Time() {

	}

	public Time(int hour, int minute, int second) {

		if ((hour >= MIN_VALUE) && (hour <= MAX_VALUE_HOUR)) {
			this.hour = hour;
		} else {
			this.hour = MIN_VALUE;
		}
		if ((minute >= MIN_VALUE) && (minute <= MAX_VALUE)) {
			this.minute = minute;
		} else {
			this.minute = MIN_VALUE;
		}
		if ((second >= MIN_VALUE) && (second <= MAX_VALUE)) {
			this.second = second;
		} else {
			this.second = MIN_VALUE;
		}

	}

	public void setHour(int hour) {
		if ((hour >= MIN_VALUE) || (hour <= MAX_VALUE_HOUR)) {
			this.hour = hour;
		} else {
			this.hour = MIN_VALUE;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {
		if ((minute >= MIN_VALUE) || (minute <= MAX_VALUE)) {
			this.minute = minute;
		} else {
			this.hour = MIN_VALUE;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		if ((second >= MIN_VALUE) || (second <= MAX_VALUE)) {
			this.second = second;
		} else {
			this.second = MIN_VALUE;
		}
	}

	public int getSecond() {
		return second;
	}

	public void changeHour(long value) {
		int newHour = 0;
		long timeInSecons = this.hour * 3600 + this.minute * 60 + second + value * 3600;
		System.out.println(timeInSecons);

		if (timeInSecons > 0) {

			newHour = (int) (timeInSecons / 3600);
			
			if (newHour >= 24) {
				newHour = newHour % 24;
				if (newHour == 24) {
					newHour = 0;
				}
			}
		} else {
			timeInSecons = Math.abs(timeInSecons);
			newHour = (int) (23 - timeInSecons / 3600 % 24);
		}

		System.out.println(newHour + "hh " + this.minute + "mm " + this.second + "ss");

	}

	public void changeMinutes(long value) {
		long newMinutes = 0;
		long newHour = 0;
		
		long timeInSecons = this.hour * 3600 + this.minute * 60 + second + value * 60;

		if (timeInSecons > 0) {
			newMinutes = timeInSecons / 60 % 60;
			newHour = (int) (timeInSecons / 3600);
			
			if (newHour >= 24) {
				newHour = newHour % 24;

			}
		} else {
			
			timeInSecons = Math.abs(timeInSecons);
			newMinutes = 59 -  timeInSecons / 60 % 60;
			newHour = (int) (23 - timeInSecons / 3600 % 24);

		}

		System.out.println(newHour + "hh " + newMinutes + "mm " + this.second + "ss");
	}
	
	public void changeSeconds(int value) {
		
		long newSeconds = 0;
		long newMinutes = 0;
		long newHour = 0;
		
		long timeInSecons = this.hour * 3600 + this.minute * 60 + second + value;
		
		if(timeInSecons > 0) {
			newSeconds = timeInSecons % 60;
			newMinutes = timeInSecons / 60 % 60;
			newHour = timeInSecons / 3600;
			
			if(newHour >= 24) {
				newHour = newHour % 24;
			}
		}else {
			timeInSecons = Math.abs(timeInSecons);
			newSeconds = 60 - timeInSecons % 60;
			newMinutes = 59 - timeInSecons / 60 % 60;
			newHour = 23 - timeInSecons / 3600 % 24;
		}
		
		System.out.println(newHour + "hh " + newMinutes + "mm " + newSeconds + "ss");
		
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
