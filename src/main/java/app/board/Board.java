package app.board;

import app.Color;
import app.PieceType;
import app.piece.*;

/**
 * This class represents a chess board.
 * This board contains 64 squares and maintains
 * the location of where each piece is on the board, as
 * well as information about the game state.
 * All moves must be made via the board and the
 * board determines if the move that is desired is a valid move.
 */
public class Board {

	/** This array contains every square of the board, indexed by x and y axes,
	 *  where the origin (squares[0][0]) is the white queenside rook's square.
	 */
	private Square[][] squares;
	
	/** These flags are true if the respective castle move is allowed, and must
	 *  be altered if any castle rights are lost in the course of a game.
	 */
	private Boolean whiteCastleKingside;
	private Boolean whiteCastleQueenside;
	private Boolean blackCastleKingside;
	private Boolean blackCastleQueenside;
	
	/** These flags are true if the respective king is currently in check. 
	 * (This is potentially unneeded, value could be checked on the fly)
	 */
	private Boolean whiteCheck;
	private Boolean blackCheck;
	
	/** Move counter, incremented after either player makes a move */
	private short moveCount;
	
	Board() {
		// Create squares and assign pieces
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				squares[x][y] = initSquare(x, y);
			}
		}
		
		// All castling rights exist at game start
		whiteCastleKingside = true;
		whiteCastleQueenside = true;
		blackCastleKingside = true;
		blackCastleQueenside = true;
		
		// No moves made yet
		moveCount = 0;
		
	}
	
	/** Helper function called by constructor to create the desired square
	 *  and give it a piece if it needs one for the initial game state.
	 */ 
	private Square initSquare(int x, int y) {
		Boolean occupied;
		Color color;
		PieceType type;

		// Set the color if we're on a back rank, otherwise we have enough info
		// to just create the square and return
		switch (y) {
		case 0: // White piece rank
			color = Color.WHITE;
			break;
		case 1: // White pawn rank
			return new Square(x, y, true, new Pawn(Color.WHITE));
		case 6: // Black pawn rank
			return new Square(x, y, true, new Pawn(Color.BLACK));
		case 7: // Black piece rank
			color = Color.BLACK;
			break;
		default:
			return new Square(x, y, false, null);
		}
		
		// Back rank case, we need to determine what kind of piece this is
		switch (x) {
		case 0: // Rooks
		case 7:
			return new Square(x, y, true, new Rook(color));
		case 1: // Knights
		case 6:
			return new Square(x, y, true, new Knight(color));
		case 2: // Bishops
		case 5:
			return new Square(x, y, true, new Bishop(color));
		case 3: // Queen
			return new Square(x, y, true, new Queen(color));
		case 4: // King
			return new Square(x, y, true, new King(color));
		}

		// Error case
		return new Square(x, y, false, null);
	}

    /**
     * Perform look up and determine if the square exists.
     * @param row of where the square is located
     * @param col of where the square is located
     * @return null if invalid dimensions, square otherwise
     */
    public Square getSquare(int row, int col){
        return null;
    }

    /**
     * Perform a look up and determine if the square
     * exists where the current square may be castled
     * from.
     * @param curr square that should be checked.
     * @return the square of where the piece on this square
     * may move too.
     */
    public Square canCastle(Square curr, Moves move){
        int currCol = curr.getCol();
        int currRow = curr.getRow();
        Square next;
        int rookCol = currCol;
        switch(move){
            case CASTLE_LEFT:
                rookCol = 0;
                break;
            case CASTLE_RIGHT:
                rookCol = 7;
                break;

        }
        for(int col = currCol; col != rookCol; col--){
            next = getSquare(currRow, col);
            switch(checkCastle(next, rookCol)){
                case -1:
                    //we have occupied or invalid square
                    return null;
                case 0:
                    //we should check next square
                    break;
                case 1:
                    //we found square
                    return next;
            }
        }
        return null;
    }

    /**
     * Helper routine to validate whether the given square is able
     * to be castled with.
     * @param next the square for which a rook must sit
     * @param rookCol column for where the rook should be
     * @return -1 for out of bounds or cannot castle
     *          0 for continue, we have not found stop condition
     *          1 for we found the place, it is next
     */
    private int checkCastle(Square next, int rookCol){
        IPiece piece;
        if(next == null){
            //if we are out of bounds
            return -1;
        }
        if(next.isOccupied()){
            //if there is someone on the square
            return -1;
        }
        piece = next.getPiece();
        if(piece == null){
            //if no piece is on the square
            return 0;
        }
        if(piece instanceof Rook && next.getCol() == rookCol){
            //if there is a rook and rook is
            //at col 0
            return 1;
        }
        return -1;
    }

    /**
     * Perform a look up and determine if the square
     * exists where the current square may perform
     * an en passant.
     * @param curr square that should be checked.
     * @return the square of where the peice will
     * be after the en passant.
     */
    public Square canEnPassant(Square curr){
        return null;
    }
}
