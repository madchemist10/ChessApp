package app;

import app.piece.Bishop;
import app.piece.IPiece;
import app.piece.MoveSets;
import org.junit.Assert;
import org.junit.Test;

/**
 * These piece tests are used
 * to ensure that pieces can only make
 * legitimate moves.
 */
public class PieceTests{

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
}
