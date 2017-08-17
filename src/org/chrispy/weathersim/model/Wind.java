package org.chrispy.weathersim.model;

public class Wind {
	private double speed;
	private byte direction;
	private String strDirection;
	private String[] directions = {"North", "Northeast", "East", "Southeast", "South", "Southwest", "West", "Northwest"};

	public Wind () {
		speed = 0.0;      // Still wind
		direction = 0;  // North by default
		strDirection = directions[direction];
	}

	public Wind (double spe, byte dir) {
		speed = spe;
		direction = dir;
		strDirection = directions[direction];
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
				"Direction: " + strDirection;
	}
}