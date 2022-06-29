package boards;

import pieces.*;

class BoardSquare {

  private BoardLocation boardLocation;
  private Piece piece;
  private boolean occupied;

  BoardSquare(BoardLocation boardLocation){
    this.occupied=false;
    this.piece=null;
    this.boardLocation=boardLocation;
  }

  /**
   *returns the piece occupied by the given square, can return null
   * @return the piece on square, can be null
   */
  Piece getPiece(){
    return piece;
  }

  /**
   *
   * @return true if the square is occupied by a piece, false otherwise
   */
  boolean isOccupied(){
    return occupied;
  }

  BoardLocation getBoardLocation() {
    return boardLocation;
  }

  /**
   * Adds a piece to the square if empty
   * @param piece to be added to square
   * @return true if piece is added, false if square was occupied by a piece
   */
  boolean addPiece(Piece piece){
    if(this.occupied){
      return false;
    }
    this.occupied=true;
    this.piece=piece;
    return true;
  }

  void removePiece(){
    this.occupied=false;
    this.piece=null;
  }
}
