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
     * Helper routine to validate a single
     * forward move for a pawn.
     * @param currRow that the pawn resides on
     * @param currCol that the pawn resides on
     * @param destRow of the square immediate forward
     * @param destCol of the square immediate forward
     */
    private static void validatePawnSingleForwardMove(int currRow, int currCol, int destRow, int destCol){
        Board board = new Board();
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
     * that resides on square {1,0} has
     * a valid move within it's list to move to
     * {2,0}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c0_Forward_r2_c0(){
        int currRow = 1;
        int currCol = 0;
        int destRow = 2;
        int destCol = 0;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,1} has
     * a valid move within it's list to move to
     * {2,1}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c1_Forward_r2_c1(){
        int currRow = 1;
        int currCol = 1;
        int destRow = 2;
        int destCol = 1;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,2} has
     * a valid move within it's list to move to
     * {2,2}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c2_Forward_r2_c2(){
        int currRow = 1;
        int currCol = 2;
        int destRow = 2;
        int destCol = 2;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,3} has
     * a valid move within it's list to move to
     * {2,3}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c3_Forward_r2_c3(){
        int currRow = 1;
        int currCol = 3;
        int destRow = 2;
        int destCol = 3;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,4} has
     * a valid move within it's list to move to
     * {2,4}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c4_Forward_r2_c4(){
        int currRow = 1;
        int currCol = 4;
        int destRow = 2;
        int destCol = 4;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,5} has
     * a valid move within it's list to move to
     * {2,5}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c5_Forward_r2_c5(){
        int currRow = 1;
        int currCol = 5;
        int destRow = 2;
        int destCol = 5;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,6} has
     * a valid move within it's list to move to
     * {2,6}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c6_Forward_r2_c6(){
        int currRow = 1;
        int currCol = 6;
        int destRow = 2;
        int destCol = 6;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,7} has
     * a valid move within it's list to move to
     * {2,7}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c7_Forward_r2_c7(){
        int currRow = 1;
        int currCol = 7;
        int destRow = 2;
        int destCol = 7;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,0} has
     * a valid move within it's list to move to
     * {5,0}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c0_Forward_r5_c0(){
        int currRow = 6;
        int currCol = 0;
        int destRow = 5;
        int destCol = 0;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }
    
    /**
     * This test validates that a pawn
     * that resides on square {6,1} has
     * a valid move within it's list to move to
     * {5,1}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c1_Forward_r5_c1(){
        int currRow = 6;
        int currCol = 1;
        int destRow = 5;
        int destCol = 1;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,2} has
     * a valid move within it's list to move to
     * {5,2}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c2_Forward_r5_c2(){
        int currRow = 6;
        int currCol = 2;
        int destRow = 5;
        int destCol = 2;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,3} has
     * a valid move within it's list to move to
     * {5,3}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c3_Forward_r5_c3(){
        int currRow = 6;
        int currCol = 3;
        int destRow = 5;
        int destCol = 3;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,4} has
     * a valid move within it's list to move to
     * {5,4}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c4_Forward_r5_c4(){
        int currRow = 6;
        int currCol = 4;
        int destRow = 5;
        int destCol = 4;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,5} has
     * a valid move within it's list to move to
     * {5,5}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c5_Forward_r5_c5(){
        int currRow = 6;
        int currCol = 5;
        int destRow = 5;
        int destCol = 5;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,6} has
     * a valid move within it's list to move to
     * {5,6}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c6_Forward_r5_c6(){
        int currRow = 6;
        int currCol = 6;
        int destRow = 5;
        int destCol = 6;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,7} has
     * a valid move within it's list to move to
     * {5,7}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c7_Forward_r5_c7(){
        int currRow = 6;
        int currCol = 7;
        int destRow = 5;
        int destCol = 7;
        validatePawnSingleForwardMove(currRow, currCol, destRow, destCol);
    }
}
