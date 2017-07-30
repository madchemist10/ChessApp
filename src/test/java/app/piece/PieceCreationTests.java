package app.piece;

import app.Color;
import app.piece.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * This set of tests validate the creation
 * and default configurations for each of the supported
 * chess pieces.
 */
public class PieceCreationTests {

    /**
     * This test validates that
     * default configuration for a bishop
     * is correct.
     * We validate:
     * <ul>
     *     <li>{@link Color}</li>
     *     <li>{@link MoveSets#BISHOP}</li>
     * </ul>
     */
    @Test
    public void validBishopCreation(){
        Color color = Color.WHITE;
        IPiece piece = new Bishop(color);
        Assert.assertNotNull(piece);
        Assert.assertEquals(color, piece.getColor());
        Assert.assertNull(piece.getCurrentPosition());
        Assert.assertEquals(MoveSets.BISHOP, piece.getMoveSet());
        Assert.assertNull(piece.getValidMoves());
    }

    /**
     * This test validates that
     * default configuration for a King
     * is correct.
     * We validate:
     * <ul>
     *     <li>{@link Color}</li>
     *     <li>{@link MoveSets#KING}</li>
     * </ul>
     */
    @Test
    public void validKingCreation(){
        Color color = Color.WHITE;
        IPiece piece = new King(color);
        Assert.assertNotNull(piece);
        Assert.assertEquals(color, piece.getColor());
        Assert.assertNull(piece.getCurrentPosition());
        Assert.assertEquals(MoveSets.KING, piece.getMoveSet());
        Assert.assertNull(piece.getValidMoves());
    }

    /**
     * This test validates that
     * default configuration for a Knight
     * is correct.
     * We validate:
     * <ul>
     *     <li>{@link Color}</li>
     *     <li>{@link MoveSets#KNIGHT}</li>
     * </ul>
     */
    @Test
    public void validKnightCreation(){
        Color color = Color.WHITE;
        IPiece piece = new Knight(color);
        Assert.assertNotNull(piece);
        Assert.assertEquals(color, piece.getColor());
        Assert.assertNull(piece.getCurrentPosition());
        Assert.assertEquals(MoveSets.KNIGHT, piece.getMoveSet());
        Assert.assertNull(piece.getValidMoves());
    }

    /**
     * This test validates that
     * default configuration for a Pawn
     * is correct.
     * We validate:
     * <ul>
     *     <li>{@link Color}</li>
     *     <li>{@link MoveSets#PAWN}</li>
     * </ul>
     */
    @Test
    public void validPawnCreation(){
        Color color = Color.WHITE;
        IPiece piece = new Pawn(color);
        Assert.assertNotNull(piece);
        Assert.assertEquals(color, piece.getColor());
        Assert.assertNull(piece.getCurrentPosition());
        Assert.assertEquals(MoveSets.PAWN, piece.getMoveSet());
        Assert.assertNull(piece.getValidMoves());
    }

    /**
     * This test validates that
     * default configuration for a Queen
     * is correct.
     * We validate:
     * <ul>
     *     <li>{@link Color}</li>
     *     <li>{@link MoveSets#QUEEN}</li>
     * </ul>
     */
    @Test
    public void validQueenCreation(){
        Color color = Color.WHITE;
        IPiece piece = new Queen(color);
        Assert.assertNotNull(piece);
        Assert.assertEquals(color, piece.getColor());
        Assert.assertNull(piece.getCurrentPosition());
        Assert.assertEquals(MoveSets.QUEEN, piece.getMoveSet());
        Assert.assertNull(piece.getValidMoves());
    }

    /**
     * This test validates that
     * default configuration for a Rook
     * is correct.
     * We validate:
     * <ul>
     *     <li>{@link Color}</li>
     *     <li>{@link MoveSets#ROOK}</li>
     * </ul>
     */
    @Test
    public void validRookCreation(){
        Color color = Color.WHITE;
        IPiece piece = new Rook(color);
        Assert.assertNotNull(piece);
        Assert.assertEquals(color, piece.getColor());
        Assert.assertNull(piece.getCurrentPosition());
        Assert.assertEquals(MoveSets.ROOK, piece.getMoveSet());
        Assert.assertNull(piece.getValidMoves());
    }
}
