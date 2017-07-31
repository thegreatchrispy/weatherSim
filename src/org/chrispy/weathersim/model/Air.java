package org.chrispy.weathersim.model;

public class Air {
	private double altitude;
	private double temperature;
	private double pressure;

	public Air () {
		altitude = 0.0;      // Sea Level
		temperature = 0.0;   // Standard Temperature in Celsius
		pressure = 101.3;    // Standard Pressure in kPa
	}

	public Air (double alt, double temp, double pres) {
		altitude = alt;
		temperature = temp;
		pressure = pres;
	}

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

	public String toString() {
		return "Altitude: " + altitude + " m\n" +
				"Temperature: " + temperature + " C\n" +
				"Pressure: " + pressure + " kPa";
	}
}