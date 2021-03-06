package app.board;

import app.piece.IPiece;

/**
 * This represents a singular square that is
 * part of the master board. Each square understands
 * if there is a piece contained on it and what
 * it's color is. Each piece is aware of whether or not
 * another piece may take its location.
 */
public class Square {

    public Square(int row, int col){

    }

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

    public IPiece getPiece(){
        return null;
    }

    public boolean equals(Square square){
        return getRow() == square.getRow() && getCol() == square.getCol();
    }
}
