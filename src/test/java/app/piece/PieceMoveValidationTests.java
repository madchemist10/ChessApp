package app.piece;

import app.Color;
import app.board.Board;
import app.board.Square;
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

    /**
     * This test validates that on a fresh game start,
     * that no bishop is able to move.
     */
    @Test
    public void bishopValidMovesValidation_FreshStart(){
        //generate default board
        Board board = new Board();
        List<Square> bishopSquares = new LinkedList<>();
        //get each bishop piece from the board
        Square whiteBishopLeft = board.getSquare(0,2);
        Square whiteBishopRight = board.getSquare(0,5);
        Square blackBishopLeft = board.getSquare(7,2);
        Square blackBishopRight = board.getSquare(7,5);
        //validate all bishops squares are not null
        Assert.assertNotNull(whiteBishopLeft);
        Assert.assertNotNull(whiteBishopRight);
        Assert.assertNotNull(blackBishopLeft);
        Assert.assertNotNull(blackBishopRight);
        //validate all bishop squares are occupied
        Assert.assertTrue(whiteBishopLeft.isOccupied());
        Assert.assertTrue(whiteBishopRight.isOccupied());
        Assert.assertTrue(blackBishopLeft.isOccupied());
        Assert.assertTrue(blackBishopRight.isOccupied());
        //add each bishop square to list
        bishopSquares.add(whiteBishopLeft);
        bishopSquares.add(whiteBishopRight);
        bishopSquares.add(blackBishopLeft);
        bishopSquares.add(blackBishopRight);
        /*
         * iterate over each bishop
         * square and ensure that the bishop
         * contained on the square has no valid moves.
         */
        for(Square curr: bishopSquares){
            IPiece bishop = curr.getPiece();
            Assert.assertNotNull(bishop);
            List<ValidMove> validMoves = bishop.getValidMoves();
            Assert.assertNotNull(validMoves);
            Assert.assertEquals(0, validMoves.size());
        }
    }

    /**
     * This test validates that on a fresh game start,
     * that no king is able to move.
     */
    @Test
    public void kingValidMovesValidation_FreshStart(){
        //generate default board
        Board board = new Board();
        List<Square> kingSquares = new LinkedList<>();
        //get each king piece from the board
        Square whiteKing = board.getSquare(0,2);
        Square blackKing = board.getSquare(0,5);
        //validate all kings squares are not null
        Assert.assertNotNull(whiteKing);
        Assert.assertNotNull(blackKing);
        //validate all king squares are occupied
        Assert.assertTrue(whiteKing.isOccupied());
        Assert.assertTrue(blackKing.isOccupied());
        //add each king square to list
        kingSquares.add(whiteKing);
        kingSquares.add(blackKing);
        /*
         * iterate over each king
         * square and ensure that the king
         * contained on the square has no valid moves.
         */
        for(Square curr: kingSquares){
            IPiece king = curr.getPiece();
            Assert.assertNotNull(king);
            List<ValidMove> validMoves = king.getValidMoves();
            Assert.assertNotNull(validMoves);
            Assert.assertEquals(0, validMoves.size());
        }
    }
}
