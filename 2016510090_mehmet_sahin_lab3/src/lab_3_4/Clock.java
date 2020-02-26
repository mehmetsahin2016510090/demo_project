package lab_3_4;

import java.util.Scanner;

public class Clock 
{
	private int hour;
	private int minute;
	
	
	public Clock(int hour, int minute) {
		
		this.hour = hour;
		this.minute = minute;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void convert() {
		if(this.hour>=0 && this.hour<=24)
		{
		if (this.hour>12) {
			this.hour=this.hour%12;
			System.out.println(this.hour+":"+this.minute+" p.m.");
		}
		else 
		
			System.out.println(this.hour+":"+ this.minute+ " a.m.");
		}
		else {
			System.out.println("hatalý sayý giriþi");
		}
		
	
	}
}
