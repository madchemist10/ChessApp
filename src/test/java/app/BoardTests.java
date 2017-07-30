package app;

import app.board.Board;
import org.junit.Assert;
import org.junit.Test;

/**
 * These tests are examples of how the
 * board reacts to specific functionality.
 */
public class BoardTests {

    /**
     * This test is used to validate that the
     * creation of a default board results in
     * a board being created.
     */
    @Test
    public void validateDefaultBoardCreation(){
        Board board = new Board();
        Assert.assertNotNull(board);
    }
}
