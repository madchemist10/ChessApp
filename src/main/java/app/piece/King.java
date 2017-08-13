package app.piece;

import app.Color;

import java.util.List;

/**
 * The King is the single chess piece that
 * must be protected at all cost. A King may
 * move from the current tile to any tile that
 * is exactly one space away.
 */
public class King extends APiece {

    /**
     * Create a new King with the specified color.
     * @param color of this King
     */
    public King(Color color){
        super(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ValidMove> getValidMoves() {
        //List<Moves> availableMoves = MoveSets.King;
        //return MoveValidator.getValidMoves(availableMoves, currentSquare, board);
        //todo: implement King moveset
        return null;
    }
}
