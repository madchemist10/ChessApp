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
     * Validate that a pawn moving forward
     * by one square is possible and that
     * the pawn is able to know about
     * the new square and the old square no
     * longer knows about the piece.
     */
    @Test
    public void movePawnSingleForward(){
        //create board
        Board board = new Board();
        //get square for pawn
        Square square = board.getSquare(1,0);
        //get pawn from square
        IPiece piece = square.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        //get square we are moving pawn to
        Square nextSquare = board.getSquare(2,0);
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
        //create board
        Board board = new Board();
        //get square for pawn
        Square square = board.getSquare(1,1);
        //get pawn from square
        IPiece piece = square.getPiece();
        Assert.assertTrue(piece instanceof Pawn);
        List<ValidMove> pawnMoves = piece.getValidMoves();
        ValidMove forward_1 = null;
        //find valid move that we are looking for
        for(ValidMove move: pawnMoves){
            if(move.getMagnitude() == 1 && move.getMove().equals(Moves.FORWARD)){
                forward_1 = move;
                break;
            }
        }
        Assert.assertNotNull(forward_1);
        //find next square we can move to based on move
        Square nextSquare = MoveValidator.determineNextSquare(square,forward_1,board);
        //validate square is what we want
        Assert.assertEquals(2, nextSquare.getRow());
        Assert.assertEquals(1, nextSquare.getCol());
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
