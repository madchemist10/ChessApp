package app.board;

/**
 * This represents a singular square that is
 * part of the master board. Each square understands
 * if there is a piece contained on it and what
 * it's color is. Each piece is aware of whether or not
 * another piece may take its location.
 */
public class Square {

	/**
	 * x and y are the coordinates of the square on the board, where each
	 * coordinate is in the range [0-7] and the origin square (x=0,y=0) is
	 * the white queenside rook's square
	 */
	int x;
	int y;
	
	/** Indicates whether the square is occupied */
	Boolean occupied;
	
	/** The piece occupying this square. Undefined if not occupied. */
	private Piece currentPiece;

	Square(int x, int y, occupied, Piece) {
		this.x = x;
		this.y = y;
		this.piece = piece;
	}
	
	public Boolean isOccupied() {
		if (occupied) {
			return true;
		}
		return false;
	}
	
	public Piece getPiece() {
		if (occupied) {
			return currentPiece;
		}
		return null;
	}
}