package app.piece;

import app.Color;
import app.board.Square;

import java.util.List;

/**
 * This interface represents the basic
 * functionality that all chess pieces
 * share.
 */
public interface IPiece {

    /**
     * Retrieve the current color that is assigned
     * to this chess piece.
     * @return Color representation of what
     * color the piece is.
     */
    Color getColor();

    /**
     * Retrieve a list of all possible moves for
     * this chess piece.
     * @return List of moves.
     */
    List<Move> getPossibleMoves();

    /**
     * Retrieve the current square that this
     * piece resides on.
     * @return this piece's currrent position.
     */
    Square getCurrentPosition();

    /**
     * Assign this piece to the current square
     * that it lives on.
     * @param currentPosition of the piece.
     */
    void setCurrentPosition(Square currentPosition);
}
