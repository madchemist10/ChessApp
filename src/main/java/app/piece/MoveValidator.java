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

    public static List<ValidMove> getValidMoves(List<Moves> moveSet, Square curr, Board board){
        List<ValidMove> validMoves = new ArrayList<>();
        ValidMove validMove;
        Square next;
        for(Moves move: moveSet){
            for(int i = 0; i < MAX_MAG; i++ ) {
                validMove = new ValidMove(move, i);
                next = determineNextSquare(curr, validMove, board);
                if(next == null || next.isOccupied()){
                    break;
                }
                //next square is not occupied, store it
                validMoves.add(validMove);
            }
        }
        return validMoves;
    }

    public static Square determineNextSquare(Square curr, ValidMove validMove, Board board){
        Moves move = validMove.getMove();
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
            case FORWARD:
                row++;
                break;
            case BACKWARD:
                row--;
                break;
            case LEFT:
                col--;
                break;
            case RIGHT:
                col++;
                break;
            case DIAGONAL_FORWARD_LEFT:
                row++;
                col--;
                break;
            case DIAGONAL_FORWARD_RIGHT:
                row++;
                col++;
                break;
            case DIAGONAL_BACKWARD_LEFT:
                row--;
                col--;
                break;
            case DIAGONAL_BACKWARD_RIGHT:
                row--;
                col++;
                break;
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
        }
        return board.getSquare(row, col);
    }

}
