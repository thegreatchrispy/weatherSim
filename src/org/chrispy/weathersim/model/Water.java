package org.chrispy.weathersim.model;

public class Water {
	private double humidity;
	private double vaporPressure;

	public double getHumidity () {
		return humidity;
	}

	public void setHumidity (double hum) {
		humidity = hum;
	}

	public double getVaporPressure () {
		return vaporPressure;
	}

	public void setVaporPressure (double vapPressure) {
		vaporPressure = vapPressure;
	}
}