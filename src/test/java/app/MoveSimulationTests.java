package app;

import app.board.Board;
import app.board.Square;
import app.piece.*;
import org.junit.Assert;
import org.junit.Test;
import sun.misc.VM;

import java.util.List;

/**
 * This set of tests validate that moves
 * may occur programmatically.
 */
public class MoveSimulationTests {

    /**
     * Helper routine to remove all pawns from play.
     * @param board that should have pawns removed.
     */
    private static void removeAllPawns(Board board){
        int row;
        Square square;
        for(int col = 0; col < 8; col++){
            row = 1;
            square = board.getSquare(row, col);
            square.setPiece(null);
            row = 6;
            square = board.getSquare(row, col);
            square.setPiece(null);
        }
    }

    /**
     * Helper routine to validate a move is able to be made for a specified piece.
     * @param startRow the starting row location
     * @param startCol the starting col location
     * @param magnitude of how many moves of the type to make
     * @param move that is wanting to be made
     * @param board that is pre-defined to support the move to make.
     */
    private static void validateMove(int startRow, int startCol, int magnitude, Moves move, Board board){
        //get square for pawn
        Square square = board.getSquare(startRow,startCol);
        //get pawn from square
        IPiece piece = square.getPiece();
        List<ValidMove> validMoveList = piece.getValidMoves();
        ValidMove forward = null;
        //find valid move that we are looking for
        for(ValidMove validMove: validMoveList){
            if(validMove.getMagnitude() == magnitude && validMove.getMove().equals(move)){
                forward = validMove;
                break;
            }
        }
        Assert.assertNotNull(forward);
        //find next square we can move to based on move
        Square nextSquare = MoveValidator.determineNextSquare(square,forward,board);
        //validate square is what we want
        Assert.assertEquals(startRow+magnitude, nextSquare.getRow());
        Assert.assertEquals(startCol, nextSquare.getCol());
        //assign new position for piece
        piece.setCurrentPosition(nextSquare);
        //validate the old square does not know about piece
        Assert.assertNull(square.getPiece());
        Assert.assertFalse(square.isOccupied());
        //validate next square knows about piece
        Assert.assertEquals(piece, nextSquare.getPiece());
        Assert.assertTrue(nextSquare.equals(piece.getCurrentPosition()));
        Assert.assertTrue(nextSquare.isOccupied());
    }

    /**
     * Validate that a pawn moving forward
     * by one square is possible and that
     * the pawn is able to know about
     * the new square and the old square no
     * longer knows about the piece.
     */
    @Test
    public void movePawnSingleForward(){
        int startRow = 1;
        int startCol = 0;
        int magnitude = 1;
        //create board
        Board board = new Board();
        //get square for pawn
        Square square = board.getSquare(startRow,startCol);
        //get pawn from square
        IPiece piece = square.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        //get square we are moving pawn to
        Square nextSquare = board.getSquare(startRow+magnitude,startCol);
        //assign new position for piece
        piece.setCurrentPosition(nextSquare);
        //validate the old square does not know about piece
        Assert.assertNull(square.getPiece());
        Assert.assertFalse(square.isOccupied());
        //validate next square knows about piece
        Assert.assertEquals(piece, nextSquare.getPiece());
        Assert.assertTrue(nextSquare.equals(piece.getCurrentPosition()));
        Assert.assertTrue(nextSquare.isOccupied());
    }

    /**
     * Test moving a pawn when the next square is
     * gathered based on the next square algorithm.
     */
    @Test
    public void movePawnViaValidMoveSingleForward(){
        int startRow = 1;
        int startCol = 1;
        int magnitude = 1;
        //create board
        Board board = new Board();
        validateMove(startRow, startCol, magnitude, Moves.FORWARD, board);
    }

    /**
     * Test moving a pawn when the next square is
     * gathered based on the next square algorithm.
     * This is moving a pawn two squares out.
     */
    @Test
    public void movePawnViaValidMoveDoubleForward(){
        int startRow = 1;
        int startCol = 2;
        int magnitude = 2;
        //create board
        Board board = new Board();
        validateMove(startRow, startCol, magnitude, Moves.FORWARD, board);
    }

    /**
     * Test moving a rook when the next square is
     * gathered based on the next square algorithm.
     * Simulates a rook moving one square forward.
     */
    @Test
    public void moveRookViaValidMoveSingleForward(){
        int startRow = 0;
        int startCol = 0;
        int magnitude = 1;
        //create board
        Board board = new Board();
        //remove all pawns
        removeAllPawns(board);
        validateMove(startRow, startCol, magnitude, Moves.FORWARD, board);
    }

    /**
     * Test moving a rook when the next square is
     * gathered based on the next square algorithm.
     * Simulates a rook moving two squares forward.
     */
    @Test
    public void moveRookViaValidMoveDoubleForward(){
        int startRow = 0;
        int startCol = 0;
        int magnitude = 2;
        //create board
        Board board = new Board();
        //remove all pawns
        removeAllPawns(board);
        validateMove(startRow, startCol, magnitude, Moves.FORWARD, board);
    }

    /**
     * Test moving a rook when the next square is
     * gathered based on the next square algorithm.
     * Simulates a rook moving two squares forward.
     */
    @Test
    public void moveRookViaValidMoveSingleBackward(){
        int startRow = 7;
        int startCol = 0;
        int magnitude = 1;
        //create board
        Board board = new Board();
        //remove all pawns
        removeAllPawns(board);
        validateMove(startRow, startCol, magnitude, Moves.BACKWARD, board);
    }

    /**
     * Test moving a rook when the next square is
     * gathered based on the next square algorithm.
     * Simulates a rook moving two squares forward.
     */
    @Test
    public void moveRookViaValidMoveDoubleBackward(){
        int startRow = 7;
        int startCol = 0;
        int magnitude = 2;
        //create board
        Board board = new Board();
        //remove all pawns
        removeAllPawns(board);
        validateMove(startRow, startCol, magnitude, Moves.BACKWARD, board);
    }

    /**
     * Test moving a knight when the next square is
     * gathered based on the next square algorithm.
     * Simulates a knight moving two squares forward
     * and one square left.
     */
    @Test
    public void moveKnightViaValidMoveL_Forward_Left(){
        int startRow = 0;
        int startCol = 1;
        int magnitude = 1;
        //create board
        Board board = new Board();
        //remove all pawns
        validateMove(startRow, startCol, magnitude, Moves.L_LEFT_FORWARD, board);
    }

    /**
     * Test moving a knight when the next square is
     * gathered based on the next square algorithm.
     * Simulates a knight moving two squares forward
     * and one square right.
     */
    @Test
    public void moveKnightViaValidMoveL_Forward_Right(){
        int startRow = 0;
        int startCol = 1;
        int magnitude = 1;
        //create board
        Board board = new Board();
        //remove all pawns
        validateMove(startRow, startCol, magnitude, Moves.L_FORWARD_RIGHT, board);
    }

    /**
     * Test moving a knight when the next square is
     * gathered based on the next square algorithm.
     * Simulates a knight moving two squares backward
     * and one square left.
     */
    @Test
    public void moveKnightViaValidMoveL_Backward_Left(){
        int startRow = 7;
        int startCol = 1;
        int magnitude = 1;
        //create board
        Board board = new Board();
        //remove all pawns
        validateMove(startRow, startCol, magnitude, Moves.L_BACKWARD_LEFT, board);
    }

    /**
     * Test moving a knight when the next square is
     * gathered based on the next square algorithm.
     * Simulates a knight moving two squares backward
     * and one square right.
     */
    @Test
    public void moveKnightViaValidMoveL_Backward_Right(){
        int startRow = 7;
        int startCol = 1;
        int magnitude = 1;
        //create board
        Board board = new Board();
        //remove all pawns
        validateMove(startRow, startCol, magnitude, Moves.L_BACKWARD_RIGHT, board);
    }
}
