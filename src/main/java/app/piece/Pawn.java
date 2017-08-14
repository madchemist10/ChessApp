package app.piece;

import app.Color;

import java.util.List;

/**
 * The Pawns are the first line of defense for
 * the chess pieces. Each pawn has the option,
 * only on the first move, to advance 2 squares
 * forward. All other pawn moves must be in 1 square
 * increments. Pawns capture opponent pieces by
 * attacPawn diagonal and forward from the current
 * square.
 */
public class Pawn extends APiece {


    /**
     * Create a new Pawn with the specified color.
     * @param color of this Pawn
     */
    public Pawn(Color color){
        super(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Moves> getMoveSet() {
        return MoveSets.PAWN;
    }
}
