package app.piece;

import app.Color;

import java.util.List;

/**
 * The Rook is a vertical can horizontal
 * moving unit that is able to advance
 * to any horizontal or vertical square
 * that is within eye-sight of the current
 * occupied square.
 */
public class Rook extends APiece {

    /**
     * Create a new Rook with the specified color.
     * @param color of this Rook
     */
    public Rook(Color color){
        super(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ValidMove> getValidMoves() {
        //List<Moves> availableMoves = MoveSets.Rook;
        //return MoveValidator.getValidMoves(availableMoves, currentSquare, board);
        //todo: implement Rook moveset
        return null;
    }
}
