package pieces;

import boards.*;
import java.util.*;

public abstract class Pawn extends Piece{
  private boolean firstMove;

  Pawn(String colour, byte rank, char file){
    super("Pawn", colour, rank, file);
    this.firstMove=true;
  }

  @Override
  boolean move(byte rank, char file, Board board){
    if (super.move(rank,file,board)){
      this.firstMove=false;
      if (rank==board.getMaxRank()||rank==board.getMinRank()) {
        boolean promoted=false;
        while (!promoted) {
          try {
            promote();
            promoted=true;
          }
          catch (IllegalArgumentException e)
          {
            System.out.println("Invalid promotion chosen");
          }
        }
      }
      return true;
    }
    return false;
  }

  boolean getFirstMove(){
    return firstMove;
  }

  /**
   *
   * @return new Piece pawn has been promoted to;
   */
  private Piece promote(){
    String choice="";
    System.out.println("Choose what to promote the pawn to, Queen, Rook, Bishop, Knight");
    Scanner in = new Scanner(System.in);
    choice = in.nextLine();
    in.close();
    choice = choice.toLowerCase();

    switch (choice) {
      case "queen" -> {
        return new Queen(super.getColour(),super.getRank(),super.getFile());
      }
      case "rook" -> {
        return new Rook(super.getColour(),super.getRank(),super.getFile());
      }
      case "bishop" -> {
        return new Bishop(super.getColour(),super.getRank(),super.getFile());
      }
      case "knight" -> {
        return new Knight(super.getColour(),super.getRank(),super.getFile());
      }
    }
    throw new IllegalArgumentException("Pawn not promoted to valid piece " +choice + " was provided");
  }

}
