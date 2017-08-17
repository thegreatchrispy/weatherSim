package org.chrispy.weathersim.model;

public class Cell {
	public final short col;
	public final short row;

	private Air air;
	private Water water;
	private Wind wind;
	private final int HASHFACTOR = 5000;

	public Cell (int col, int row) {
		this.col = (short)col;
		this.row = (short)row;

		air = new Air();
		water = new Water();
		wind = new Wind();
	}

	public boolean equals (Object obj) {
		if (!(obj instanceof Cell)) {
			return false;
		}

		return col == ((Cell)o).col && row == ((Cell)o).row;
	}

	public int getX () {
		return col;
	}

	public void setX (int x) {
		col = x;
	}

	public int getY () {
		return row;
	}

	public int getX (int y) {
		row = y;
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
		return "Cell at ("+col+", "+row+") :\n" +
		air.toString() +
		water.toString() + 
		wind.toString();
	}
}