package app;

import app.piece.*;
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

    /**
     * Validate that each and only each move
     * that should be a member of the knight's
     * move set are contained within that set.
     */
    @Test
    public void knightMoveSetValidation(){
        IPiece knight = new Knight(Color.WHITE);
        List<Moves> moveSet = knight.getMoveSet();
        List<Moves> KNIGHT = new LinkedList<>();
        KNIGHT.add(Moves.L_FORWARD_LEFT);
        KNIGHT.add(Moves.L_FORWARD_RIGHT);
        KNIGHT.add(Moves.L_LEFT_FORWARD);
        KNIGHT.add(Moves.L_RIGHT_FORWARD);
        KNIGHT.add(Moves.L_BACKWARD_LEFT);
        KNIGHT.add(Moves.L_BACKWARD_RIGHT);
        KNIGHT.add(Moves.L_LEFT_BACKWARD);
        KNIGHT.add(Moves.L_RIGHT_BACKWARD);
        Assert.assertEquals(KNIGHT.size(), moveSet.size());
        for(Moves move: KNIGHT){
            Assert.assertTrue(moveSet.contains(move));
        }
    }

    /**
     * Validate that each and only each move
     * that should be a member of the pawn's
     * move set are contained within that set.
     */
    @Test
    public void pawnMoveSetValidation(){
        IPiece pawn = new Pawn(Color.WHITE);
        List<Moves> moveSet = pawn.getMoveSet();
        List<Moves> PAWN = new LinkedList<>();
        PAWN.add(Moves.FORWARD);
        PAWN.add(Moves.DIAGONAL_FORWARD_LEFT);
        PAWN.add(Moves.DIAGONAL_FORWARD_RIGHT);
        PAWN.add(Moves.EN_PASSANT);
        Assert.assertEquals(PAWN.size(), moveSet.size());
        for(Moves move: PAWN){
            Assert.assertTrue(moveSet.contains(move));
        }
    }

    /**
     * Validate that each and only each move
     * that should be a member of the queen's
     * move set are contained within that set.
     */
    @Test
    public void queenMoveSetValidation(){
        IPiece queen = new Queen(Color.WHITE);
        List<Moves> moveSet = queen.getMoveSet();
        List<Moves> QUEEN = new LinkedList<>();
        QUEEN.add(Moves.FORWARD);
        QUEEN.add(Moves.BACKWARD);
        QUEEN.add(Moves.LEFT);
        QUEEN.add(Moves.RIGHT);
        QUEEN.add(Moves.DIAGONAL_FORWARD_LEFT);
        QUEEN.add(Moves.DIAGONAL_FORWARD_RIGHT);
        QUEEN.add(Moves.DIAGONAL_BACKWARD_LEFT);
        QUEEN.add(Moves.DIAGONAL_BACKWARD_RIGHT);
        Assert.assertEquals(QUEEN.size(), moveSet.size());
        for(Moves move: QUEEN){
            Assert.assertTrue(moveSet.contains(move));
        }
    }

    /**
     * Validate that each and only each move
     * that should be a member of the rook's
     * move set are contained within that set.
     */
    @Test
    public void rookMoveSetValidation(){
        IPiece rook = new Rook(Color.WHITE);
        List<Moves> moveSet = rook.getMoveSet();
        List<Moves> ROOK = new LinkedList<>();
        ROOK.add(Moves.FORWARD);
        ROOK.add(Moves.BACKWARD);
        ROOK.add(Moves.LEFT);
        ROOK.add(Moves.RIGHT);
        ROOK.add(Moves.CASTLE_LEFT);
        ROOK.add(Moves.CASTLE_RIGHT);
        Assert.assertEquals(ROOK.size(), moveSet.size());
        for(Moves move: ROOK){
            Assert.assertTrue(moveSet.contains(move));
        }
    }
}
