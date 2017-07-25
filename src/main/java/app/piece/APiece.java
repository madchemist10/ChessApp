package app.piece;

import app.Color;
import app.board.Board;
import app.board.Square;

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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBoard(Board board) {
        this.board = board;
    }
}
