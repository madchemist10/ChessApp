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

    public Moves getMove(){
        return move;
    }
    public int getMagnitude(){
        return magnitude;
    }
}
