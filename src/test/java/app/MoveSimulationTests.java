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
        //get square for pawn
        Square square = board.getSquare(startRow,startCol);
        //get pawn from square
        IPiece piece = square.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        List<ValidMove> pawnMoves = piece.getValidMoves();
        ValidMove forward = null;
        //find valid move that we are looking for
        for(ValidMove move: pawnMoves){
            if(move.getMagnitude() == magnitude && move.getMove().equals(Moves.FORWARD)){
                forward = move;
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
        //get square for pawn
        Square square = board.getSquare(startRow,startCol);
        //get pawn from square
        IPiece piece = square.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        List<ValidMove> pawnMoves = piece.getValidMoves();
        ValidMove forward = null;
        //find valid move that we are looking for
        for(ValidMove move: pawnMoves){
            if(move.getMagnitude() == magnitude && move.getMove().equals(Moves.FORWARD)){
                forward = move;
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
        //get square for rook
        Square square = board.getSquare(startRow,startCol);
        //get rook from square
        IPiece piece = square.getPiece();
        Assert.assertTrue(piece instanceof Rook);
        List<ValidMove> rookMoves = piece.getValidMoves();
        ValidMove forward = null;
        //find valid move that we are looking for
        for(ValidMove move: rookMoves){
            if(move.getMagnitude() == magnitude && move.getMove().equals(Moves.FORWARD)){
                forward = move;
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
        //get square for rook
        Square square = board.getSquare(startRow,startCol);
        //get rook from square
        IPiece piece = square.getPiece();
        Assert.assertTrue(piece instanceof Rook);
        List<ValidMove> rookMoves = piece.getValidMoves();
        ValidMove forward = null;
        //find valid move that we are looking for
        for(ValidMove move: rookMoves){
            if(move.getMagnitude() == magnitude && move.getMove().equals(Moves.FORWARD)){
                forward = move;
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
}
