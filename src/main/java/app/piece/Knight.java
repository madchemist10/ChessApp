package app.piece;

import app.Color;

import java.util.List;

/**
 * The Knight piece has the most special
 * move set of all the pieces. A Knight must move
 * in an "L" shape from the current square. The destination
 * square may never be the same color as the square that
 * the knight currently resides on. A knight may move in
 * one square horizontal then two vertical or any combination
 * as long as three squares are traversed in this manner.
 */
public class Knight extends APiece {

    /**
     * Create a new knight with the specified color.
     * @param color of this knight
     */
    public Knight(Color color){
        super(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    List<Moves> getMoveSet() {
        return MoveSets.KNIGHT;
    }
}
