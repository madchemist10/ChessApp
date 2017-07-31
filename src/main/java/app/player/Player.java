package app.player;

import app.Color;
import app.board.Square;
import app.piece.IPiece;
import app.piece.ValidMove;

import java.util.List;

/**
 * This interface presents all functionality
 * that is required to interact with the game board
 * and make moves.
 */
public interface Player {

    Color getColor();

    void makeMove(IPiece piece, Square dest);

    void capturePiece(IPiece piece, IPiece dest);

    void setTurn();

    void endTurn();

    List<ValidMove> getValidMoves(IPiece piece);
}
