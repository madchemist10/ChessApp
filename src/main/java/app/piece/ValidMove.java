package app.piece;

/**
 */
public class ValidMove {

    private final Moves move;

    private final int magnitude;

    public ValidMove(Moves move, int magnitude){
        this.move = move;
        this.magnitude = magnitude;
    }

    private Moves getMove(){
        return move;
    }
    private int getMagnitude(){
        return magnitude;
    }
}
