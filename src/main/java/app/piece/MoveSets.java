package app.piece;

import java.util.ArrayList;
import java.util.List;

/**
 * This file contains the possible moves
 * for each of the supported chess pieces.
 */
public class MoveSets {

    /**
     * This is the valid move set available to all
     * pieces of type {@link Bishop}.
     */
    public static final List<Moves> BISHOP = new ArrayList<>();
    static{
        BISHOP.add(Moves.DIAGONAL_FORWARD_LEFT);
        BISHOP.add(Moves.DIAGONAL_FORWARD_RIGHT);
        BISHOP.add(Moves.DIAGONAL_BACKWARD_LEFT);
        BISHOP.add(Moves.DIAGONAL_BACKWARD_RIGHT);
    }
    public static final List<Moves> KING = new ArrayList<>();
    public static final List<Moves> KNIGHT = new ArrayList<>();
    public static final List<Moves> PAWN = new ArrayList<>();
    public static final List<Moves> QUEEN = new ArrayList<>();
    public static final List<Moves> ROOK = new ArrayList<>();

}
