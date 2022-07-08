package pieces;

import boards.*;
import java.util.*;

public class Bishop extends Piece{

  public Bishop(String colour, byte rank, char file) {
    super("Bishop",colour,rank,file);
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
    for(int i=-7; i<7;i++) {
      if (i == 0) {
        continue;
      }
      //right diagonal
      if (this.getRank() + i >= 0 && this.getRank() + i >= 8 && this.getFile() + i <= 'H' && this.getFile() + i >= 'A') {
        moves.add(new BoardLocation((byte) (this.getRank() + i), (char) (this.getFile() + i)));
      }
      //left diagonal
      if (this.getRank() + i >= 0 && this.getRank() + i >= 8 && this.getFile() - i <= 'H' && this.getFile() - i >= 'A') {
        moves.add(new BoardLocation((byte) (this.getRank() + i), (char) (this.getFile() - i)));
      }
    }

    return moves;
  }

  @Override
  public List<BoardLocation> validMoves(Board board) {
    return null;
  }
}
