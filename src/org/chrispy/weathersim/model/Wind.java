package org.chrispy.weathersim.model;

public class Wind {
	private double speed;
	private byte direction;
	private String[] directions = {"North", "Northeast", "East", "Southeast", "South", "Southwest", "West", "Northwest"};

	public Wind () {
		speed = 0.0;      // Still wind
		direction = 0;  // North by default
	}

	public double getSpeed () {
		return speed;
	}

	public void setSpeed (double spe) {
		speed = spe;
	}

	public byte getDirection () {
		return direction;
	}

	public void setDirection (byte dir) {
		direction = dir;
	}

	public String directionToString () {
		return directions[direction];
	}

	public String toString() {
		return "Speed: " + speed + "km/h\n" +
				"Direction: " + directions[direction];
	}
}