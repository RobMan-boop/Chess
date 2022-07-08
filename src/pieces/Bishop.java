package pieces;

import boards.*;

import java.util.*;

public class Bishop extends Piece {

  public Bishop(String colour, byte rank, char file) {
    super("Bishop", colour, rank, file);
  }

  /**
   * Creates a list of all possible moves that a piece can take ignoring if a move puts the king in check
   *
   * @param board the board the move is being made on
   * @return List of all possible move locations
   */
  @Override
  List<BoardLocation> possibleMoves(Board board) {
    List<BoardLocation> moves = new ArrayList<>();
    //right diagonal
    //left diagonal
    for (int i = 1; i <= 7; i++) {
      //right diagonal up (white) +rank +file
      byte newRank = (byte) (super.getRank() + i);
      char newFile = (char) (super.getFile() + i);

      if (super.getRank() + i >= 0 && super.getRank() + i >= 8 && super.getFile() + i <= Board.getMaxFile() && super.getFile() + i >= Board.getMinFile()) {
        if (newRank >= 0 && newRank<= Board.getMaxRank() && newFile <= Board.getMaxFile() && newFile >= Board.getMinFile()) {
          if (board.isEmpty( (newRank),  (newFile))) {
            moves.add(new BoardLocation( (newRank),  (newFile)));
          } else {
            moves.add(new BoardLocation(newRank,newFile));
            break;
          }
        } else {
          break;
        }
      }
    }

    for (int i = 1; i <= 7; i++) {
      //right diagonal down (white) -rank + file
      byte newRank = (byte) (super.getRank() - i);
      char newFile = (char) (super.getFile() + i);

      if (newRank >= 0 && newRank<= Board.getMaxRank() && newFile <= Board.getMaxFile() && newFile >= Board.getMinFile()) {
        if (board.isEmpty( (newRank),  (newFile))) {
          moves.add(new BoardLocation( (newRank),  (newFile)));
        } else {
          moves.add(new BoardLocation(newRank,newFile));
          break;
        }
      } else {
        break;
      }

    }


    for (int i = 1; i <= 7; i++) {
      //left diagonal up (White) +rank - file
      byte newRank = (byte) (super.getRank() + i);
      char newFile = (char) (super.getFile() - i);

      if (newRank >=Board.getMinRank() && newRank<= Board.getMaxRank() && newFile <= Board.getMaxFile() && newFile >= Board.getMinFile()) {
        if (board.isEmpty( (newRank),  (newFile))) {
          moves.add(new BoardLocation( (newRank),  (newFile)));
        } else {
          moves.add(new BoardLocation(newRank,newFile));
          break;
        }
      } else {
        break;
      }
    }

    for (int i = 1; i <= 7; i++) {

      //left diagonal down (white) - rank -file
      byte newRank = (byte) (super.getRank() - i);
      char newFile = (char) (super.getFile() - i);

      if (newRank >=Board.getMinRank() && newRank<= Board.getMaxRank() && newFile <= Board.getMaxFile() && newFile >= Board.getMinFile()) {
        if (board.isEmpty( (newRank),  (newFile))) {
          moves.add(new BoardLocation( (newRank),  (newFile)));
        } else {
          moves.add(new BoardLocation(newRank,newFile));
          break;
        }
      } else {
        break;

      }
    }

    return moves;
  }


  @Override
  public List<BoardLocation> validMoves(Board board) {
    return null;
  }
}
