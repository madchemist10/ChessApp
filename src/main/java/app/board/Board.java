package app.board;

/**
 * This class represents a chess board.
 * This board contains 64 squares and maintains
 * the location of where each piece is on the board.
 * All moves must be made via the board and the
 * board determines if the move that is desired is a valid move.
 */
public class Board {
    private static final int NUM_ROWS = 8;
    private static final int NUM_COLS = 8;
    private Square[][] squares = new Square[NUM_ROWS][NUM_COLS];

    public Board(){

    }

    private void createSquares(){
        for(int i = 0; i < NUM_ROWS; i++){
            for(int j = 0; j < NUM_COLS; j++){
                squares[i][j] = new Square();
            }
        }
    }

    private void createPieces(){

    }

    private void placePieces(){

    }
}
