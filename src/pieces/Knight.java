package pieces;

import boards.*;
import java.util.*;

public class Knight extends Piece{
  public Knight(String colour, byte rank, char file) {
    super("Knight",colour,rank,file);
  }

  /**
   * Provides a list of all board locations that a piece can make a valid move to.
   *
   * @param board the board the move is being made on
   * @return list of all valid move locations.
   */
  @Override
  List<boardLocation> possibleMoves(Board board) {
    List<boardLocation> moves = new ArrayList<>();
    //Each if statement refers to one of 8 moves a knight can make
    if (super.getRank()-2>=board.getMinRank() && super.getFile()-1 >=board.getMinFile()){
      moves.add(new boardLocation((byte) (super.getRank()-2), (char) (super.getFile()-1)));
    }
    if (super.getRank()-2>=board.getMinRank() && super.getFile()+1 <=board.getMaxFile()){
      moves.add(new boardLocation((byte) (super.getRank()-1), (char) (super.getFile()+1)));
    }
    if (super.getRank()-1>=board.getMinRank() && super.getFile()-2 >=board.getMinFile()){
      moves.add(new boardLocation((byte) (super.getRank()-1), (char) (super.getFile()-2)));
    }
    if (super.getRank()-1>=board.getMinRank() && super.getFile()+2 <=board.getMaxFile()){
      moves.add(new boardLocation((byte) (super.getRank()-1), (char) (super.getFile()+2)));
    }
    if (super.getRank()+2<=board.getMaxRank() && super.getFile()-1 >=board.getMinFile()){
      moves.add(new boardLocation((byte) (super.getRank()+2), (char) (super.getFile()-1)));
    }
    if (super.getRank()+2<=board.getMaxRank() && super.getFile()+1 <=board.getMaxFile()){
      moves.add(new boardLocation((byte) (super.getRank()+2), (char) (super.getFile()+1)));
    }
    if (super.getRank()+1<=board.getMaxRank() && super.getFile()-2 >=board.getMinFile()){
      moves.add(new boardLocation((byte) (super.getRank()+1), (char) (super.getFile()-2)));
    }
    if (super.getRank()+1<=board.getMaxRank() && super.getFile()+2 <=board.getMaxFile()){
      moves.add(new boardLocation((byte) (super.getRank()+1), (char) (super.getFile()+2)));
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
  public List<boardLocation> validMoves(Board board) {
    return null;
  }
}
