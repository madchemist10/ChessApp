package app.piece;

import app.board.Board;
import app.board.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * This set of tests are used to validate
 * that all 8 pawns of both black and white can make
 * a single forward move.
 */
public class PawnSingleForwardMoveTests {

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
        int destRow = 2;
        int destCol = 0;
        Square dest = new Square(destRow, destCol);
        Square curr = board.getSquare(currRow, currCol);
        IPiece piece = curr.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        ValidMove validMove = new ValidMove(Moves.FORWARD, 1);
        PieceTests.validatePieceMove(piece, validMove);
        Square next = MoveValidator.determineNextSquare(curr,validMove,board);
        Assert.assertTrue(dest.equals(next));
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,1} has
     * a valid move within it's list to move to
     * {2,1}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c1_Forward_r2_c1(){
        Board board = new Board();
        int currRow = 1;
        int currCol = 1;
        int destRow = 2;
        int destCol = 1;
        Square dest = new Square(destRow, destCol);
        Square curr = board.getSquare(currRow, currCol);
        IPiece piece = curr.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        ValidMove validMove = new ValidMove(Moves.FORWARD, 1);
        PieceTests.validatePieceMove(piece, validMove);
        Square next = MoveValidator.determineNextSquare(curr,validMove,board);
        Assert.assertTrue(dest.equals(next));
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,1} has
     * a valid move within it's list to move to
     * {2,1}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c2_Forward_r2_c2(){
        Board board = new Board();
        int currRow = 1;
        int currCol = 2;
        int destRow = 2;
        int destCol = 2;
        Square dest = new Square(destRow, destCol);
        Square curr = board.getSquare(currRow, currCol);
        IPiece piece = curr.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        ValidMove validMove = new ValidMove(Moves.FORWARD, 1);
        PieceTests.validatePieceMove(piece, validMove);
        Square next = MoveValidator.determineNextSquare(curr,validMove,board);
        Assert.assertTrue(dest.equals(next));
    }
}
