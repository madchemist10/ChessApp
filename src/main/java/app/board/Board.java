package app.board;

import app.piece.IPiece;
import app.piece.King;
import app.piece.Moves;
import app.piece.Rook;

/**
 * This class represents a chess board.
 * This board contains 64 squares and maintains
 * the location of where each piece is on the board.
 * All moves must be made via the board and the
 * board determines if the move that is desired is a valid move.
 */
public class Board {

    /**
     * Perform look up and determine if the square exists.
     * @param row of where the square is located
     * @param col of where the square is located
     * @return null if invalid dimensions, square otherwise
     */
    public Square getSquare(int row, int col){
        return null;
    }

    /**
     * Perform a look up and determine if the square
     * exists where the current square may be castled
     * from.
     * @param curr square that should be checked.
     * @return the square of where the piece on this square
     * may move too.
     */
    public Square canCastle(Square curr, Moves move){
        int currCol = curr.getCol();
        int currRow = curr.getRow();
        Square next;
        int rookCol = currCol;
        switch(move){
            case CASTLE_LEFT:
                rookCol = 0;
                break;
            case CASTLE_RIGHT:
                rookCol = 7;
                break;

        }
        for(int col = currCol; col != rookCol; col--){
            next = getSquare(currRow, col);
            switch(checkCastle(next, rookCol)){
                case -1:
                    //we have occupied or invalid square
                    return null;
                case 0:
                    //we should check next square
                    break;
                case 1:
                    //we found square
                    return next;
            }
        }
        return null;
    }

    /**
     * Helper routine to validate whether the given square is able
     * to be castled with.
     * @param next the square for which a rook must sit
     * @param rookCol column for where the rook should be
     * @return -1 for out of bounds or cannot castle
     *          0 for continue, we have not found stop condition
     *          1 for we found the place, it is next
     */
    private int checkCastle(Square next, int rookCol){
        IPiece piece;
        if(next == null){
            //if we are out of bounds
            return -1;
        }
        if(next.isOccupied()){
            //if there is someone on the square
            return -1;
        }
        piece = next.getPiece();
        if(piece == null){
            //if no piece is on the square
            return 0;
        }
        if(piece instanceof Rook && next.getCol() == rookCol){
            //if there is a rook and rook is
            //at col 0
            return 1;
        }
        return -1;
    }

    /**
     * Perform a look up and determine if the square
     * exists where the current square may perform
     * an en passant.
     * @param curr square that should be checked.
     * @return the square of where the peice will
     * be after the en passant.
     */
    public Square canEnPassant(Square curr){
        return null;
    }
}
