package org.chrispy.weathersim;

import org.chrispy.weathersim.model.*;

import java.awt.Dimension;
import java.util.Enumeration;
import java.util.Hashtable;

public class Simulator {
	private int cellCols;
	private int cellRows;
	private int generations;
	private Cell[][] grid;

	private Hashtable currentWeather;
	private Hashtable nextWeather;

	public Simulator (int numCols, int numRows) {
		cellCols = numCols;
		cellRows = numRows;
		currentWeather = new Hashtable();
		nextWeather = new Hashtable();

		grid = new Cell[cellCols][cellRows];
		for (int c = 0; c < cellCols; c++) {
			for (int r = 0; r < cellRows; r++) {
				grid[c][r] = new Cell(c, r);
			}
		}
	}

	public synchronized void clear () {
		generations = 0;
		currentWeather.clear();
		nextWeather.clear();
	}

	public synchronized void next () {
		Cell cell;
		int col;
		int row;
		Cell[] neighbors;
		Enumeration enumeration;

		generations++;
		nextWeather.clear();

		// Reset cells as new cells
		enumeration = currentWeather.keys();
	}

	public Enumeration getEnum () {
		return currentWeather.keys();
	}

	public synchronized Cell getCell (int col, int row) {
		Cell cell = new Cell(col, row);

		try {
			cell = grid[col][row];
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return cell;
	}

	public synchronized void setCell (int col, int row, Cell cell) {
		try {
			grid[col][row] = cell;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Dimension getDimension () {
		return new Dimension(cellCols, cellRows);
	}
}