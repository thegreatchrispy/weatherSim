package org.chrispy.weathersim;

import org.chrispy.weathersim.model.*;

import java.awt.Dimension;
import java.util.Enumeration;

public interface CellGrid {
	public Cell getCell (int col, int row);

	public void setCell (int col, int row, Cell cell);

	public Dimension getDimension ();

	//public void resize (int col, int row);

	public Enumeration getEnum ();

	public void clear ();
}