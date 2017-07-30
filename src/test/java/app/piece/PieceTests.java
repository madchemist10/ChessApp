package app.piece;

import org.junit.Assert;

import java.util.List;

/**
 * These piece tests are used
 * to ensure that pieces can only make
 * legitimate moves.
 */
public class PieceTests{

    /**
     * Helper routine to validate that the given
     * piece can make the specified move.
     * @param piece that wants to move
     * @param validMove that should be contained within
     *                  the piece's valid moves.
     */
    static void validatePieceMove(IPiece piece, ValidMove validMove){
        List<ValidMove> validMoves = piece.getValidMoves();
        boolean moveContained = false;
        for(ValidMove move: validMoves){
            if(validMove.equals(move)){
                moveContained = true;
                break;
            }
        }
        Assert.assertTrue(moveContained);
    }
}
