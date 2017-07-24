package org.chrispy.weathersim.model;

public class Cell {
    public final short col;
    public final short row;
    public byte neighborCells;

    private Air air;
    private Water water;
    private Wind wind;
    private final int HASHFACTOR = 5000;

    public Cell (int col, int row) {
        this.col = (short)col;
        this.row = (short)row;
        neighborCells = 0;

        air = new Air();
        water = new Water();
        wind = new Wind();
    }

    public boolean equals (Object o) {
        if (!(o instanceof Cell)) {
            return false;
        }

        return col == ((Cell)o).col && row == ((Cell)o).row;
    }

    public int hashCode () {
        return HASHFACTOR*row+col;
    }

    public String toString() {
        return "Cell at ("+col+", "+row+") with "+neighborCells+" neighbor"+(neighborCells==1?"":"s");
    }
}