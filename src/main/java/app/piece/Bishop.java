package app.piece;

import app.Color;

import java.util.List;

/**
 * The Bishop is a diagonal moving pieces
 * that is able to move to any other square within
 * eye-shot of the current square provided that
 * the bishop remains on the same colored square
 * that it currently resides on.
 */
public class Bishop extends APiece {

    /**
     * Create a new bishop with the specified color.
     * @param color of this bishop
     */
    public Bishop(Color color){
        super(color);
    }

    @Override
    List<Moves> getMoveSet() {
        return MoveSets.BISHOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ValidMove> getValidMoves() {
        return MoveValidator.getValidMoves(getMoveSet(), currentSquare, board);
    }


}
