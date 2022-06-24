package pieces;

import boards.*;
import java.util.*;

/**
 * represents a chess piece
 */
public abstract class Piece {
  private String pieceName;
  private String colour;
  private char file;
  private byte rank;
  Piece(String pieceName, String colour, byte rank, char file){
    this.pieceName=pieceName;
    this.colour=colour;
    this.file=file;
    this.rank =rank;
  }

  /**
   * Creates a list of all possible moves that a piece can take ignoring if a move puts the king in check
   * @param board the board the move is being made on
   * @return List of all possible move locations
   */
  abstract List<boardLocation> possibleMoves(Board board);
  /**
   * Provides a list of all board locations that a piece can make a valid move to.
   * @param board the board the move is being made on
   * @return list of all valid move locations
   */
  public abstract List<boardLocation> validMoves(Board board);

  /**
   * Moves the specified piece to the new location given if it is a legal move
   * @param rank the rank for the piece to be moved to
   * @param file the file for the piece to be moved to
   * @param board the board the piece is being moved on
   * @return true if piece is moved, false if move is not made
   */
  boolean move(byte rank, char file, Board board){
    boardLocation currentMove = new boardLocation(rank,file);
    if (validMoves(board).contains(currentMove)){
      this.setFile(file);
      this.setRank(rank);
      return true;
    }
    return false;
  }

  public byte getRank() {
    return rank;
  }

  public char getFile() {
    return file;
  }

  public String getPieceName() {
    return pieceName;
  }

  public String getColour() {
    return colour;
  }

  void setRank(byte rank) {
    this.rank = rank;
  }

  void setFile(char file) {
    this.file = file;
  }
}
