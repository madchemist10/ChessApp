package app.piece;

import app.board.Board;
import app.board.Square;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * These piece tests are used
 * to ensure that pieces can only make
 * legitimate moves.
 */
public class PieceTests{

    /**
     * This test validates that a pawn
     * that resides on square {1,0} has
     * a valid move within it's list to move to
     * {2,0}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c0_Forward_r2_c0(){
        Board board = new Board();
        int currRow = 1;
        int currCol = 0;
        Square dest = new Square(2, 0);
        Square curr = board.getSquare(currRow, currCol);
        IPiece piece = curr.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        List<ValidMove> validMoves = piece.getValidMoves();
        ValidMove validMove = new ValidMove(Moves.FORWARD, 1);
        boolean moveContained = false;
        for(ValidMove move: validMoves){
            if(move.getMove().equals(validMove.getMove()) && validMove.getMagnitude() == validMove.getMagnitude()){
                moveContained = true;
                break;
            }
        }
        Assert.assertTrue(moveContained);
        Square next = MoveValidator.determineNextSquare(curr,validMove,board);
        Assert.assertTrue(dest.equals(next));
    }
}
