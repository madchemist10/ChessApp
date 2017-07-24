package app.piece;

import app.Color;
import app.board.Square;

import java.util.List;

/**
 * The Bishop is a diagonal moving pieces
 * that is able to move to any other square within
 * eye-shot of the current square provided that
 * the bishop remains on the same colored square
 * that it currently resides on.
 */
public class Bishop implements IPiece {

    private final Color color;

    private Square currentSquare;

    public Bishop(Color color){
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public List<Move> getPossibleMoves() {
        List<Move> availableMoves = MoveSets.BISHOP;
        return null;
    }

    @Override
    public Square getCurrentPosition() {
        return currentSquare;
    }

    @Override
    public void setCurrentPosition(Square currentPosition) {
        this.currentSquare = currentPosition;
    }
}
