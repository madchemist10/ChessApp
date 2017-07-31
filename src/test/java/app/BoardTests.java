package app;

import app.board.Board;
import app.board.Square;
import app.piece.*;
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

    /**
     * Validate that each pawn is placed on the
     * correct square per the color and square
     * location.
     */
    @Test
    public void validatePawnPlacement(){
        //create board
        Board board = new Board();
        int row = 1;
        for(int col = 0;col < 8; col++) {
            Square square = board.getSquare(row, col);
            Assert.assertNotNull(square);
            Assert.assertTrue(square.isOccupied());
            IPiece piece = square.getPiece();
            Assert.assertNotNull(piece);
            Assert.assertTrue(piece instanceof Pawn);
            //// TODO: 7/30/2017 validate color
            Assert.assertTrue(square.equals(piece.getCurrentPosition()));
        }
        row = 6;
        for(int col = 0;col < 8; col++) {
            Square square = board.getSquare(row, col);
            Assert.assertNotNull(square);
            Assert.assertTrue(square.isOccupied());
            IPiece piece = square.getPiece();
            Assert.assertNotNull(piece);
            Assert.assertTrue(piece instanceof Pawn);
            //// TODO: 7/30/2017 validate color
            Assert.assertTrue(square.equals(piece.getCurrentPosition()));
        }
    }

    /**
     * Validate that each rook is placed on
     * the correct square per the color
     * and square location.
     */
    @Test
    public void validateRookPlacement(){
        //create board
        Board board = new Board();
        int row = 0;
        int col = 0;
        //left most white rook
        //validate square and piece at {0,0}
        Square square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        IPiece piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Rook);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        col = 7;
        //right most white rook
        //validate square and piece at {0,7}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Rook);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));
        
        row = 7;
        col = 0;
        //left most black rook
        //validate square and piece at {7,0}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Rook);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        col = 7;
        //right most black rook
        //validate square and piece at {7,7}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Rook);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));
    }

    /**
     * Validate that each knight is placed on
     * the correct square per the color
     * and square location.
     */
    @Test
    public void validateKnightPlacement(){
        //create board
        Board board = new Board();
        int row = 0;
        int col = 1;
        //left most white knight
        //validate square and piece at {0,1}
        Square square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        IPiece piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Knight);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        col = 6;
        //right most white knight
        //validate square and piece at {0,6}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Knight);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        row = 7;
        col = 1;
        //left most black knight
        //validate square and piece at {7,1}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Knight);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        col = 6;
        //right most black knight
        //validate square and piece at {7,6}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Knight);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));
    }

    /**
     * Validate that each bishop is placed on
     * the correct square per the color
     * and square location.
     */
    @Test
    public void validateBishopPlacement(){
        //create board
        Board board = new Board();
        int row = 0;
        int col = 2;
        //left most white bishop
        //validate square and piece at {0,2}
        Square square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        IPiece piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Bishop);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        col = 5;
        //right most white bishop
        //validate square and piece at {0,5}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Bishop);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        row = 7;
        col = 2;
        //left most black bishop
        //validate square and piece at {7,2}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Bishop);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        col = 5;
        //right most black bishop
        //validate square and piece at {7,5}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Bishop);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));
    }


    /**
     * Validate that each king is placed on
     * the correct square per the color
     * and square location.
     */
    @Test
    public void validateKingPlacement(){
        //create board
        Board board = new Board();
        int row = 0;
        int col = 4;
        //left most white king
        //validate square and piece at {0,4}
        Square square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        IPiece piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof King);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        row = 7;
        //left most black king
        //validate square and piece at {7,4}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof King);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));
    }

    /**
     * Validate that each queen is placed on
     * the correct square per the color
     * and square location.
     */
    @Test
    public void validateQueenPlacement(){
        //create board
        Board board = new Board();
        int row = 0;
        int col = 3;
        //left most white queen
        //validate square and piece at {0,3}
        Square square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        IPiece piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Queen);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));

        row = 7;
        //left most black queen
        //validate square and piece at {7,3}
        square = board.getSquare(row,col);
        Assert.assertNotNull(square);
        Assert.assertTrue(square.isOccupied());
        piece = square.getPiece();
        Assert.assertNotNull(piece);
        Assert.assertTrue(piece instanceof Queen);
        //// TODO: 7/30/2017 validate color 
        Assert.assertTrue(square.equals(piece.getCurrentPosition()));
    }
}
