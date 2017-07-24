package org.chrispy.weathersim.model;

public class Water {
	private double humidity;
	private double vaporPressure;

	public Water () {
		humidity = 50.0;      // Percentage
		vaporPressure = 1.0;  // Estimated standard
	}

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