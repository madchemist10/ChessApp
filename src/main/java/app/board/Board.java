package app.board;

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
    public Square canCastle(Square curr){
        return null;
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
