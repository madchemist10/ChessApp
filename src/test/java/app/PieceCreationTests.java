package app;

import app.piece.Bishop;
import app.piece.IPiece;
import app.piece.King;
import app.piece.MoveSets;
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
}
