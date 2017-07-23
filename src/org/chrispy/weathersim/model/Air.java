package org.chrispy.weathersim.model;

public class Air {
	private double altitude;
	private double temperature;
	private double pressure;

	public double getAltitude () {
		return altitude;
	}

	public void setAltitude (double alt) {
		altitude = alt;
	}

	public double getTemperature () {
		return temperature;
	}

	public void setTemperature (double temp) {
		temperature = temp;
	}

	public double getPressure () {
		return pressure;
	}

	public void setPressure (double pres) {
		pressure = pres;
	}
}