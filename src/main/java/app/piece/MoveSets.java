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
    public static final List<Move> BISHOP = new ArrayList<>();
    static{
        BISHOP.add(Move.DIAGONAL_FORWARD_LEFT);
        BISHOP.add(Move.DIAGONAL_FORWARD_RIGHT);
        BISHOP.add(Move.DIAGONAL_BACKWARD_LEFT);
        BISHOP.add(Move.DIAGONAL_BACKWARD_RIGHT);
    }
    public static final List<Move> KING = new ArrayList<>();
    public static final List<Move> KNIGHT = new ArrayList<>();
    public static final List<Move> PAWN = new ArrayList<>();
    public static final List<Move> QUEEN = new ArrayList<>();
    public static final List<Move> ROOK = new ArrayList<>();

}
