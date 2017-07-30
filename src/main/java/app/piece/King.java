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
     * Create a new king with the specified color.
     * @param color of this king
     */
    public King(Color color){
        super(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Moves> getMoveSet() {
        return MoveSets.KING;
    }
}
