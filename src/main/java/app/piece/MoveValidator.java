package app.piece;

import app.board.Board;
import app.board.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for validating that a move
 * is valid for the given piece and set of possible moves.
 */
public class MoveValidator {

    public static List<ValidMove> getValidMoves(List<Moves> moveSet, Square curr, Board board){
        List<ValidMove> validMoves = new ArrayList<>();
        for(Moves move: moveSet){
            //todo determine how to validate move set based on squares
        }
        return validMoves;
    }
}
