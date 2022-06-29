package pieces;

import boards.*;
import java.util.*;

public class BlackPawn extends Pawn {
  public BlackPawn(String colour, byte rank, char file){

    super(colour, rank, file);
  }
  @Override
  List<BoardLocation> possibleMoves(Board board){
    List<BoardLocation> moves = new ArrayList<>();
    if (super.getFirstMove() && board.isEmpty((byte) (super.getRank()-2),super.getFile())){//Forward 2 squares available on first move for pawn
      moves.add(new BoardLocation( (byte)(super.getRank() - 2), super.getFile() ));
    }
    if(board.isEmpty((byte)(super.getRank()-1),super.getFile())){ // pawn moving forward 1 square
      moves.add(new BoardLocation((byte)(super.getRank()-1),super.getFile()));
    }
    if (super.getFile()!='A') { //pawn taking piece forward on left
      if (!board.isEmpty((byte) (super.getRank() - 1), (char) (super.getFile() - 1))) {
        moves.add(new BoardLocation((byte) (super.getRank()-1), (char) (super.getFile() - 1)));
      }
    }
    if (super.getFile()!='H'){//pawn taking piece forward on right
      if(!board.isEmpty((byte) (super.getRank()-1), (char) (super.getFile()+1))){
        moves.add(new BoardLocation((byte) (super.getRank()-1), (char) (super.getFile()+1)));
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
  public List<BoardLocation> validMoves(Board board) {
    return null;
  }


}
