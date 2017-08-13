package app.piece;

import app.Color;

import java.util.List;

/**
 * The Queen is the most powerful
 * piece that combines the abilities
 * of Rooks and Bishops into a single piece.
 * A Queen may move in any direction from
 * the current square, that may be diagonal,
 * horizontal, or vertical as long as the destination
 * is within eye-sight of the current occupied square.
 */
public class Queen extends APiece {

    /**
     * Create a new Queen with the specified color.
     * @param color of this Queen
     */
    public Queen(Color color){
        super(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ValidMove> getValidMoves() {
        //List<Moves> availableMoves = MoveSets.Queen;
        //return MoveValidator.getValidMoves(availableMoves, currentSquare, board);
        //todo: implement Queen moveset
        return null;
    }
}
