package org.chrispy.weathersim.model;

public class Cell {
	public int x;
	public int y;

	private Air air;
	private Water water;
	private Wind wind;
	private final int HASHFACTOR = 5000;

	public Cell (int col, int row) {
		x = col;
		y = row;

		air = new Air();
		water = new Water();
		wind = new Wind();
	}

	public boolean equals (Object obj) {
		if (!(obj instanceof Cell)) {
			return false;
		}

		return x == ((Cell)obj).x && y == ((Cell)obj).y;
	}

	public int getX () {
		return x;
	}

	public void setX (int col) {
		x = col;
	}

	public int getY () {
		return y;
	}

	public void setY (int row) {
		y = row;
	}

	public Air getAir () {
		return air;
	}

	public void setAir (Air a) {
		air = a;
	}

	public Water getWater () {
		return water;
	}

	public void setWater (Water wa) {
		water = wa;
	}

	public Wind getWind () {
		return wind;
	}

	public void setWind (Wind wi) {
		wind = wi;
	}

	public String toString() {
		return "Cell at ("+x+", "+y+") :\n" +
		air.toString() +
		water.toString() + 
		wind.toString();
	}
}