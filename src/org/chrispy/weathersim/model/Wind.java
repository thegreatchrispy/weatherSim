package org.chrispy.weathersim.model;

public class Wind {
	private double speed;
	private byte direction;

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
}