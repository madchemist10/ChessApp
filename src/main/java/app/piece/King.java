package app.piece;

import app.Color;

import java.util.List;

/**
 * The King is the single chess piece that
 * must be protected at all cost. A King may
 * move from the current tile to any tile that
 * is exactly one space away.
 */
public class King extends APiece{

    /**
     * Create a new bishop with the specified color.
     * @param color of this bishop
     */
    public King(Color color){
        super(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    List<Moves> getMoveSet() {
        return MoveSets.KING;
    }
}
