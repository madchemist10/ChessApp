package app.piece;

import app.board.Board;
import app.board.Square;
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

    /**
     * Helper routine to validate a single
     * forward move for a pawn.
     * @param currRow that the pawn resides on
     * @param currCol that the pawn resides on
     * @param destRow of the square immediate forward
     * @param destCol of the square immediate forward
     */
    static void validatePawnForwardMove(int currRow, int currCol, int destRow, int destCol, int magnitude){
        Board board = new Board();
        Square dest = new Square(destRow, destCol);
        Square curr = board.getSquare(currRow, currCol);
        IPiece piece = curr.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        ValidMove validMove = new ValidMove(Moves.FORWARD, magnitude);
        PieceTests.validatePieceMove(piece, validMove);
        Square next = MoveValidator.determineNextSquare(curr,validMove,board);
        Assert.assertTrue(dest.equals(next));
    }
}
