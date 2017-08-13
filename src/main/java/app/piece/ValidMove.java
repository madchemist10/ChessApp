package app.piece;

/**
 * This subclass represents what a valid
 * move is. Contents are a move specifier
 * and a magnitude of how many squares based
 * on the move that the piece may take.
 */
public class ValidMove {

    /**
     * The move that represents the core
     * functionality of this valid move.
     */
    private final Moves move;

    /**
     * The number of squares this move
     * may be iterated to ensure endpoint
     * destination
     */
    private final int magnitude;

    /**
     * Create a new Valid Move representation
     * @param move that should be placed
     *             as the identifier for
     *             this valid move.
     * @param magnitude number of squares this move
     *                  should be extended to.
     */
    ValidMove(Moves move, int magnitude){
        this.move = move;
        this.magnitude = magnitude;
    }

    /**
     * Retrieve the move that represents
     * this valid move.
     * @return the internal move
     */
    public Moves getMove(){
        return move;
    }

    /**
     * Retrieve the magnitude assigned to
     * this valid move.
     * @return the number of squares this
     * move can be extended over.
     */
    public int getMagnitude(){
        return magnitude;
    }

    /**
     * Custom equals routine to ensure
     * the equality of this valid move
     * against another valid move.
     * @param validMove that should be checked against
     *                  this.
     * @return true if same, false otherwise.
     */
    public boolean equals(ValidMove validMove){
        return magnitude == validMove.getMagnitude() && move.equals(validMove.getMove());
    }
}
