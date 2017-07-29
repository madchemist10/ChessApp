package app.piece;

import java.util.LinkedList;
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
    public static final List<Moves> BISHOP = new LinkedList<>();
    static{
        BISHOP.add(Moves.DIAGONAL_FORWARD_LEFT);
        BISHOP.add(Moves.DIAGONAL_FORWARD_RIGHT);
        BISHOP.add(Moves.DIAGONAL_BACKWARD_LEFT);
        BISHOP.add(Moves.DIAGONAL_BACKWARD_RIGHT);
    }

    /**
     * This is the valid move set available to all
     * pieces of type {@link King}.
     */
    public static final List<Moves> KING = new LinkedList<>();
    static{
        KING.add(Moves.FORWARD);
        KING.add(Moves.BACKWARD);
        KING.add(Moves.LEFT);
        KING.add(Moves.RIGHT);
        KING.add(Moves.DIAGONAL_FORWARD_LEFT);
        KING.add(Moves.DIAGONAL_FORWARD_RIGHT);
        KING.add(Moves.DIAGONAL_BACKWARD_LEFT);
        KING.add(Moves.DIAGONAL_BACKWARD_RIGHT);
        KING.add(Moves.CASTLE_LEFT);
        KING.add(Moves.CASTLE_RIGHT);
    }

    /**
     * This is the valid move set available to all
     * pieces of type {@link Knight}.
     */
    public static final List<Moves> KNIGHT = new LinkedList<>();
    static{
        KNIGHT.add(Moves.L_FORWARD_LEFT);
        KNIGHT.add(Moves.L_FORWARD_RIGHT);
        KNIGHT.add(Moves.L_LEFT_FORWARD);
        KNIGHT.add(Moves.L_RIGHT_FORWARD);
        KNIGHT.add(Moves.L_BACKWARD_LEFT);
        KNIGHT.add(Moves.L_BACKWARD_RIGHT);
        KNIGHT.add(Moves.L_LEFT_BACKWARD);
        KNIGHT.add(Moves.L_RIGHT_BACKWARD);
    }

    /**
     * This is the valid move set available to all
     * pieces of type {@link Pawn}.
     */
    public static final List<Moves> PAWN = new LinkedList<>();
    static{
        PAWN.add(Moves.FORWARD);
        PAWN.add(Moves.DIAGONAL_FORWARD_LEFT);
        PAWN.add(Moves.DIAGONAL_FORWARD_RIGHT);
        PAWN.add(Moves.EN_PASSANT);
    }

    /**
     * This is the valid move set available to all
     * pieces of type {@link Queen}.
     */
    public static final List<Moves> QUEEN = new LinkedList<>();
    static{
        QUEEN.add(Moves.FORWARD);
        QUEEN.add(Moves.BACKWARD);
        QUEEN.add(Moves.LEFT);
        QUEEN.add(Moves.RIGHT);
        QUEEN.add(Moves.DIAGONAL_FORWARD_LEFT);
        QUEEN.add(Moves.DIAGONAL_FORWARD_RIGHT);
        QUEEN.add(Moves.DIAGONAL_BACKWARD_LEFT);
        QUEEN.add(Moves.DIAGONAL_BACKWARD_RIGHT);
    }

    /**
     * This is the valid move set available to all
     * pieces of type {@link Rook}.
     */
    public static final List<Moves> ROOK = new LinkedList<>();
    static{
        ROOK.add(Moves.FORWARD);
        ROOK.add(Moves.BACKWARD);
        ROOK.add(Moves.LEFT);
        ROOK.add(Moves.RIGHT);
    }

}
