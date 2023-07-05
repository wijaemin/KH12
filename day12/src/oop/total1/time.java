package oop.total1;

public class time {
	private int hour, min, sec;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min / 60 >= 1 && min > 0) {
			this.hour++;
			this.min = min % 60;
		} else {
			this.min = min;
		}
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		{
			for (int i = 0; i < 6; i++) {
				if (sec / 60 >= 1 && sec > 0) {
					this.min++;
					this.sec = sec % 60;
				} else {
					this.sec = sec;
				}
			}
		}
	}

	time(int hour, int min, int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}

	public time(int min, int sec) {
		this.min = min;
		this.sec = sec;
	}

	public time(int sec) {
		this.sec = sec;
	}

	public int getSum() {
		return (hour * 60 * 60) + (min * 60) + sec;
	}

	public int getSum1() {
		return (min * 60 + sec);
	}

	public int getSum2() {
		return (sec);
	}

	int getTotalHour() {
		return this.hour = getSum() / 3600;
	}

	int getTotalMin() {
		return this.min;

	}

	int getTotalSec() {
		return this.sec = getSum2() & 60;
	}

	public void show() {
		System.out.print(getTotalHour() + "시간	  ");
		System.out.print(getTotalMin() + "분	");
		System.out.print(getTotalSec() + "초");
		System.out.println("");
	}
	
}

