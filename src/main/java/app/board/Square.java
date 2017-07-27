package app.board;

/**
 * This represents a singular square that is
 * part of the master board. Each square understands
 * if there is a piece contained on it and what
 * it's color is. Each piece is aware of whether or not
 * another piece may take its location.
 */
public class Square {

    private boolean isOccupied = false;

    public boolean isOccupied(){
        return isOccupied;
    }

    public int getRow(){
        return 0;
    }

    public int getCol(){
        return 0;
    }
}
