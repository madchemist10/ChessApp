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
    private static final int MAX_MAG = 8;

    public static List<ValidMove> getValidMoves(List<Moves> moveSet, Square curr, Board board){
        List<ValidMove> validMoves = new ArrayList<>();
        for(Moves move: moveSet){
            for(int i = 0; i < MAX_MAG; i++ ) {
                ValidMove validMove = new ValidMove(move, i);
                Square next = determineNextSquare(curr, validMove);
                if(next == null || next.isOccupied()){
                    break;
                }
                validMoves.add(validMove);
            }
        }
        return validMoves;
    }

    public static Square determineNextSquare(Square current, ValidMove move){
        return current;
    }

}
