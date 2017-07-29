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

    private Square currentSquare;

    private Board board;

    private List<ValidMove> validMoves = null;

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
    public List<ValidMove> getValidMoves() {
        return validMoves;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Square getCurrentPosition() {
        return currentSquare;
    }

    /**
     * Set the current set of valid moves on
     * every current position change.
     * {@inheritDoc}
     */
    @Override
    public void setCurrentPosition(Square currentPosition) {
        this.currentSquare = currentPosition;
        validMoves = MoveValidator.getValidMoves(this, board);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBoard(Board board) {
        this.board = board;
    }
}
