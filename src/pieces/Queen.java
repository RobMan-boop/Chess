package pieces;

import boards.*;
import java.util.*;

public class Queen extends Piece{


  public Queen(String colour, byte rank, char file) {
    super("Queen",colour,rank,file);
  }

  /**
   * Creates a list of all possible moves that a piece can take ignoring if a move puts the king in check
   *
   * @param board the board the move is being made on
   * @return List of all possible move locations
   */
  @Override
  List<BoardLocation> possibleMoves(Board board) {
    return null;
  }

  @Override
  public List<BoardLocation> validMoves(Board board) {
    return null;
  }
}
