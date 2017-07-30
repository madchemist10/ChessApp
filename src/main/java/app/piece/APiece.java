package app.piece;

import app.Color;
import app.board.Board;
import app.board.Square;

import java.util.List;

/**
 * The Bishop is a diagonal moving pieces
 * that is able to move to any other square within
 * eye-shot of the current square provided that
 * the bishop remains on the same colored square
 * that it currently resides on.
 */
abstract class APiece implements IPiece {

    /**
     * This piece's defined color.
     * Used in ensuring capture is against
     * opponent piece.
     */
    private final Color color;

    /**
     * The current square that this
     * piece sits on.
     */
    private Square currentSquare;

    /**
     * The board for which this piece
     * is a member of. Used for
     * determining moves.
     */
    private Board board;

    /**
     * Local list of all valid moves
     * that this piece can make based
     * on the current layout of the board.
     */
    private List<ValidMove> validMoves = null;

    /**
     * Create a new abstract piece, that contains
     * all functionality shared among each
     * of the piece types.
     * @param color that this piece will remain
     *              for the duration of the game.
     */
    APiece(Color color){
        this.color = color;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ValidMove> getValidMoves() {
        return validMoves;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Square getCurrentPosition() {
        return currentSquare;
    }

    /**
     * Set the current set of valid moves on
     * every current position change.
     * {@inheritDoc}
     */
    @Override
    public void setCurrentPosition(Square currentPosition) {
        this.currentSquare = currentPosition;
        validMoves = MoveValidator.getValidMoves(this, board);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBoard(Board board) {
        this.board = board;
    }
}
