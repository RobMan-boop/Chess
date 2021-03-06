package pieces;

import boards.*;
import java.util.*;

public class King extends Piece{

  public King(String colour, byte rank, char file){
    super("King",colour,rank,file);
  }
  /**
   * Provides a list of all board locations that a piece can make a valid move to.
   *
   * @param board the board the move is being made on
   * @return list of all valid move locations.
   */
  @Override
  List<BoardLocation> possibleMoves(Board board) {
    List<BoardLocation> moves = new ArrayList<BoardLocation>();
    for(int i=-1;i<=1;i++){
      for (int j=-1;j<=1;j++){
        if(i!=0|j!=0){
          if (board.isEmpty((byte) (super.getRank()+i), (char) (super.getFile()+j))){
            moves.add(new BoardLocation((byte) (super.getRank() + i), (char) (super.getFile() + j)));
          }
        }
      }
    }
    return moves;
  }

  /**
   * Provides a list of all board locations that a piece can make a valid move to.
   *
   * @param board the board the move is being made on
   * @return list of all valid move locations
   */
  @Override
  public List<BoardLocation> validMoves(Board board) {
    return null;
  }
}
