package org.chrispy.weathersim;

import org.chrispy.weathersim.model.*;

public class CellGrid {
	int width;
	int height;
	int generation;
	Cell[][] grid;

	public CellGrid(int x, int y) {
		width = x;
		height = y;
		generation = 0;
		grid = new Cell[x][y];
	}

	public int getWidth () {
		return width;
	}

	public void setWidth (int x) {
		width = x;
	}

	public int getHeight () {
		return height;
	}

	public void setHeight (int y) {
		height = y;
	}

	public int getGeneration () {
		return generation;
	}

	public void setGeneration (int gen) {
		generation = gen;
	}

	public Cell getCell (int col, int row) {
		return grid[col][row];
	}

	public void setCell (int col, int row, Cell cell) {
		width = col;
		height = row;
		grid[col][row] = cell;
	}

	public void clear () {
	}
}