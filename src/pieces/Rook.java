package pieces;

import boards.*;
import java.util.*;

public class Rook extends Piece{

  public Rook(String colour, byte rank, char file) {
    super("Rook", colour, rank, file);
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
    for (int i=1;i<=7;i++){
      //Moving rank forwards (white) rank+
      byte newRank= (byte) ( super.getRank()+i);
      if(newRank<=Board.getMaxRank()) {
        if (board.isEmpty(newRank, super.getFile())) {
          moves.add(new BoardLocation(newRank, super.getFile()));
        } else {
          moves.add(new BoardLocation(newRank, super.getFile()));
          break;
        }
      }
      else {
        break;
      }
    }

    for (int i=1;i<=7;i++){
      byte newRank= (byte) ( super.getRank()+i);
      if(newRank>=Board.getMinRank()) {
        if (board.isEmpty(newRank, super.getFile())) {
          moves.add(new BoardLocation(newRank, super.getFile()));
        } else {
          moves.add(new BoardLocation(newRank, super.getFile()));
          break;
        }
      }
      else {
        break;
      }
    }
    for (int i=1;i<=7;i++){
      char newFile = (char) ( super.getFile()+i);
      if(newFile<=Board.getMaxFile()) {
        if (board.isEmpty(super.getRank(), newFile)) {
          moves.add(new BoardLocation(super.getRank(), newFile));
        } else {
          moves.add(new BoardLocation(super.getRank(), newFile));
          break;
        }
      }
      else {
        break;
      }
    }
    for (int i=1;i<=7;i++){
      //Moving file left (white) file-
      char newFile = (char) ( super.getFile()-i);
      if(newFile>=Board.getMinFile()) {
        if (board.isEmpty(super.getRank(), newFile)) {
          moves.add(new BoardLocation(super.getRank(), newFile));
        } else {
          moves.add(new BoardLocation(super.getRank(), newFile));
          break;
        }
      }
      else {
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
