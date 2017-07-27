package app.piece;

import app.Color;
import app.board.Board;
import app.board.Square;

import java.util.List;

/**
 * The Bishop is a diagonal moving pieces
 * that is able to move to any other square within
 * eye-shot of the current square provided that
 * the bishop remains on the same colored square
 * that it currently resides on.
 */
abstract class APiece implements IPiece {

    private final Color color;

    Square currentSquare;

    Board board;

    List<ValidMove> validMoves = null;

    APiece(Color color){
        this.color = color;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Square getCurrentPosition() {
        return currentSquare;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCurrentPosition(Square currentPosition) {
        this.currentSquare = currentPosition;
        validMoves = getValidMoves();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Get the move set for the implemented piece.
     * Used in determining next valid move sets.
     * @return the move set for this piece.
     */
    abstract List<Moves> getMoveSet();
}
