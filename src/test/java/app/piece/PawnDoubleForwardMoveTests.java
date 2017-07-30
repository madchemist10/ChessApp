package app.piece;

import org.junit.Test;

/**
 * This set of tests are used to validate
 * that all 8 pawns of both black and white can make
 * a double forward move.
 */
public class PawnDoubleForwardMoveTests {

    /**
     * Helper routine to validate a single
     * forward move for a pawn.
     * @param currRow that the pawn resides on
     * @param currCol that the pawn resides on
     * @param destRow of the square immediate forward
     * @param destCol of the square immediate forward
     */
    private static void validatePawnDoubleForwardMove(int currRow, int currCol, int destRow, int destCol){
        PieceTests.validatePawnForwardMove(currRow, currCol, destRow, destCol, 2);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,0} has
     * a valid move within it's list to move to
     * {3,0}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c0_Forward_r3_c0(){
        int currRow = 1;
        int currCol = 0;
        int destRow = 3;
        int destCol = 0;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,1} has
     * a valid move within it's list to move to
     * {3,1}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c1_Forward_r3_c1(){
        int currRow = 1;
        int currCol = 1;
        int destRow = 3;
        int destCol = 1;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,2} has
     * a valid move within it's list to move to
     * {3,2}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c2_Forward_r3_c2(){
        int currRow = 1;
        int currCol = 2;
        int destRow = 3;
        int destCol = 2;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,3} has
     * a valid move within it's list to move to
     * {3,3}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c3_Forward_r3_c3(){
        int currRow = 1;
        int currCol = 3;
        int destRow = 3;
        int destCol = 3;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,4} has
     * a valid move within it's list to move to
     * {3,4}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c4_Forward_r3_c4(){
        int currRow = 1;
        int currCol = 4;
        int destRow = 3;
        int destCol = 4;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,5} has
     * a valid move within it's list to move to
     * {3,5}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c5_Forward_r3_c5(){
        int currRow = 1;
        int currCol = 5;
        int destRow = 3;
        int destCol = 5;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,6} has
     * a valid move within it's list to move to
     * {3,6}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c6_Forward_r3_c6(){
        int currRow = 1;
        int currCol = 6;
        int destRow = 3;
        int destCol = 6;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {1,7} has
     * a valid move within it's list to move to
     * {3,7}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r1_c7_Forward_r3_c7(){
        int currRow = 1;
        int currCol = 7;
        int destRow = 3;
        int destCol = 7;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,0} has
     * a valid move within it's list to move to
     * {4,0}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c0_Forward_r4_c0(){
        int currRow = 6;
        int currCol = 0;
        int destRow = 4;
        int destCol = 0;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,1} has
     * a valid move within it's list to move to
     * {4,1}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c1_Forward_r4_c1(){
        int currRow = 6;
        int currCol = 1;
        int destRow = 4;
        int destCol = 1;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,2} has
     * a valid move within it's list to move to
     * {4,2}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c2_Forward_r4_c2(){
        int currRow = 6;
        int currCol = 2;
        int destRow = 4;
        int destCol = 2;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,3} has
     * a valid move within it's list to move to
     * {4,3}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c3_Forward_r4_c3(){
        int currRow = 6;
        int currCol = 3;
        int destRow = 4;
        int destCol = 3;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,4} has
     * a valid move within it's list to move to
     * {4,4}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c4_Forward_r4_c4(){
        int currRow = 6;
        int currCol = 4;
        int destRow = 4;
        int destCol = 4;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,5} has
     * a valid move within it's list to move to
     * {4,5}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c5_Forward_r4_c5(){
        int currRow = 6;
        int currCol = 5;
        int destRow = 4;
        int destCol = 5;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,6} has
     * a valid move within it's list to move to
     * {4,6}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c6_Forward_r4_c6(){
        int currRow = 6;
        int currCol = 6;
        int destRow = 4;
        int destCol = 6;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }

    /**
     * This test validates that a pawn
     * that resides on square {6,7} has
     * a valid move within it's list to move to
     * {4,7}, that is a single step forward.
     */
    @Test
    public void moveValidatePawn_r6_c7_Forward_r4_c7(){
        int currRow = 6;
        int currCol = 7;
        int destRow = 4;
        int destCol = 7;
        validatePawnDoubleForwardMove(currRow, currCol, destRow, destCol);
    }
}
