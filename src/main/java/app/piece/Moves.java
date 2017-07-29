package app.piece;

/**
 * This class represents all possible move sets
 * that may be used for a single chess piece.
 */
public enum Moves {
    FORWARD,
    BACKWARD,
    LEFT,
    RIGHT,
    DIAGONAL_FORWARD_LEFT,
    DIAGONAL_FORWARD_RIGHT,
    DIAGONAL_BACKWARD_LEFT,
    DIAGONAL_BACKWARD_RIGHT,
    L_FORWARD_LEFT,
    L_FORWARD_RIGHT,
    L_BACKWARD_LEFT,
    L_BACKWARD_RIGHT,
    L_RIGHT_FORWARD,
    L_RIGHT_BACKWARD,
    L_LEFT_FORWARD,
    L_LEFT_BACKWARD,
    CASTLE_RIGHT,
    CASTLE_LEFT,
    EN_PASSANT
}
