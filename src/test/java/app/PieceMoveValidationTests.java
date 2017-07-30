package app;

import app.piece.Bishop;
import app.piece.IPiece;
import app.piece.King;
import app.piece.Moves;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * This set of tests are used to validate that
 * each piece's move sets are correct.
 */
public class PieceMoveValidationTests {

    /**
     * Validate that each and only each move
     * that should be a member of the bishop's
     * move set are contained within that set.
     */
    @Test
    public void bishopMoveSetValidation(){
        IPiece bishop = new Bishop(Color.WHITE);
        List<Moves> moveSet = bishop.getMoveSet();
        List<Moves> BISHOP = new LinkedList<>();
        BISHOP.add(Moves.DIAGONAL_FORWARD_LEFT);
        BISHOP.add(Moves.DIAGONAL_FORWARD_RIGHT);
        BISHOP.add(Moves.DIAGONAL_BACKWARD_LEFT);
        BISHOP.add(Moves.DIAGONAL_BACKWARD_RIGHT);
        Assert.assertEquals(BISHOP.size(), moveSet.size());
        for(Moves move: BISHOP){
            Assert.assertTrue(moveSet.contains(move));
        }
    }

    /**
     * Validate that each and only each move
     * that should be a member of the king's
     * move set are contained within that set.
     */
    @Test
    public void kingMoveSetValidation(){
        IPiece king = new King(Color.WHITE);
        List<Moves> moveSet = king.getMoveSet();
        List<Moves> KING = new LinkedList<>();
        KING.add(Moves.FORWARD);
        KING.add(Moves.BACKWARD);
        KING.add(Moves.LEFT);
        KING.add(Moves.RIGHT);
        KING.add(Moves.DIAGONAL_FORWARD_LEFT);
        KING.add(Moves.DIAGONAL_FORWARD_RIGHT);
        KING.add(Moves.DIAGONAL_BACKWARD_LEFT);
        KING.add(Moves.DIAGONAL_BACKWARD_RIGHT);
        KING.add(Moves.CASTLE_LEFT);
        KING.add(Moves.CASTLE_RIGHT);
        Assert.assertEquals(KING.size(), moveSet.size());
        for(Moves move: KING){
            Assert.assertTrue(moveSet.contains(move));
        }
    }

    @Test
    public void knightMoveSetValidation(){

    }

    @Test
    public void pawnMoveSetValidation(){

    }

    @Test
    public void queenMoveSetValidation(){

    }

    @Test
    public void rookMoveSetValidation(){

    }
}
