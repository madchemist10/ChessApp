package app.piece;

import app.board.Board;
import app.board.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for validating that a move
 * is valid for the given piece and set of possible moves.
 */
public class MoveValidator {
    private static final int MAX_MAG = 8;

    /**
     * Routine to determine the list of valid moves,
     * for the given move set and the current position.
     * @param piece piece that we are determining valid moves for.
     * @param board that maintains all piece placements.
     * @return list of valid moves for the current piece.
     */
    public static List<ValidMove> getValidMoves(IPiece piece, Board board){
        List<ValidMove> validMoves = new ArrayList<>();
        ValidMove validMove;
        Square next;
        for(Moves move: piece.getMoveSet()){
            for(int i = 0; i < MAX_MAG; i++ ) {
                validMove = new ValidMove(move, i);
                next = determineNextSquare(piece.getCurrentPosition(), validMove, board);
                if(next == null || next.isOccupied()){
                    break;
                }
                //next square is not occupied, store it
                validMoves.add(validMove);
            }
        }
        return validMoves;
    }

    /**
     * This routine is responsible for determining
     * what the next square is that should be advanced to
     * via the valid move that has been made.
     * @param curr the square from which the move may be made from
     * @param validMove the move that wants to be made
     * @param board that maintains all piece placements
     * @return the square for where the valid move points.
     */
    public static Square determineNextSquare(Square curr, ValidMove validMove, Board board){
        Moves move = validMove.getMove();
        int magnitude = validMove.getMagnitude();
        int row = curr.getRow();
        int col = curr.getCol();
        /*
         * FORWARD = row +
         * BACKWARD = row -
         * LEFT = col -
         * RIGHT = col +
         * DIAGONAL = row & col
         * L = double second param
         */
        switch(move){
            /*
             * Handle normal vertical and
             * horizontal based moves.
             */
            case FORWARD:
                row+=magnitude;
                break;
            case BACKWARD:
                row-=magnitude;
                break;
            case LEFT:
                col-=magnitude;
                break;
            case RIGHT:
                col+=magnitude;
                break;
            /*
             * Handle all diagonal based
             * moves.
             */
            case DIAGONAL_FORWARD_LEFT:
                row+=magnitude;
                col-=magnitude;
                break;
            case DIAGONAL_FORWARD_RIGHT:
                row+=magnitude;
                col+=magnitude;
                break;
            case DIAGONAL_BACKWARD_LEFT:
                row-=magnitude;
                col-=magnitude;
                break;
            case DIAGONAL_BACKWARD_RIGHT:
                row-=magnitude;
                col+=magnitude;
                break;
            /*
             * Handle all Knight based
             * moves.
             */
            case L_FORWARD_LEFT:
                row++;
                col-=2;
                break;
            case L_FORWARD_RIGHT:
                row++;
                col+=2;
                break;
            case L_BACKWARD_LEFT:
                row--;
                col-=2;
                break;
            case L_BACKWARD_RIGHT:
                row--;
                col+=2;
                break;
            case L_RIGHT_FORWARD:
                col++;
                row+=2;
                break;
            case L_RIGHT_BACKWARD:
                col++;
                row-=2;
                break;
            case L_LEFT_FORWARD:
                col--;
                row+=2;
                break;
            case L_LEFT_BACKWARD:
                col--;
                row-=2;
                break;
            /*
             * Handle the special move cases that
             * can have multiple options, depending on
             * current set up of the board.
             */
            case CASTLE_RIGHT:
            case CASTLE_LEFT:
                return board.canCastle(curr, move);
            case EN_PASSANT:
                return board.canEnPassant(curr);
        }
        return board.getSquare(row, col);
    }

}
