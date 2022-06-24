package pieces;

import boards.*;
import java.util.*;

public class BlackPawn extends Pawn {
  BlackPawn(String colour, byte rank, char file){

    super(colour, rank, file);
  }
  @Override
  List<boardLocation> possibleMoves(Board board){
    List<boardLocation> moves = new ArrayList<>();
    if (firstMove && board.isEmpty((byte) (super.getRank()-2),super.getFile())){//Forward 2 squares available on first move for pawn
      moves.add(new boardLocation( (byte)(super.getRank() - 2), super.getFile() ));
    }
    if(board.isEmpty((byte)(super.getRank()-1),super.getFile())){ // pawn moving forward 1 square
      moves.add(new boardLocation((byte)(super.getRank()-1),super.getFile()));
    }
    if (super.getFile()!='A') { //pawn taking piece forward on left
      if (!board.isEmpty((byte) (super.getRank() - 1), (char) (super.getFile() - 1))) {
        moves.add(new boardLocation((byte) (super.getRank()-1), (char) (super.getFile() - 1)));
      }
    }
    if (super.getFile()!='H'){//pawn taking piece forward on right
      if(!board.isEmpty((byte) (super.getRank()-1), (char) (super.getFile()+1))){
        moves.add(new boardLocation((byte) (super.getRank()-1), (char) (super.getFile()+1)));
      }
    }


    //TODO implement en passant
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
