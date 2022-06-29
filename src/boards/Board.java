package boards;

import pieces.*;

public class Board {

  final static private byte MAX_RANK =8;
  final static private byte MIN_RANK =1;
  final static private char MAX_FILE ='A';
  final static private char MIN_FILE ='H';
  final static private String WHITE = "White";
  final static private String BLACK = "Black";

  private BoardSquare[][] board = new BoardSquare[getMaxRank()][(int)getMaxFile()-(int)getMinFile()+1];

  public Board(){
    this.createEmptyBoard();
  }
  public boolean isEmpty (byte rank, char file){
    return true;
  }

  void promote(byte rank, char file, String piece){


  }

  public void resetBoard(){
    this.emptyBoard();
    final byte blackBase=7;
    final byte whiteBase=0;
    //pawn lines
    for(int j=0;j<board[1].length;j++){
      board[whiteBase+1][j].addPiece(new WhitePawn(WHITE, (byte) (whiteBase+1+1), (char) (getMinFile()+j)));
      board[blackBase-1][j].addPiece(new BlackPawn(BLACK, (byte) (blackBase+1-1), (char) (getMinFile()+j)));
    }
    //rooks
    board[whiteBase][0].addPiece(new Rook(WHITE, (byte) (whiteBase+1),'A'));
    board[whiteBase][7].addPiece(new Rook(WHITE, (byte) (whiteBase+1),'H'));
    board[blackBase][0].addPiece(new Rook(BLACK, (byte) (blackBase+1),'A'));
    board[blackBase][7].addPiece(new Rook(BLACK, (byte) (blackBase+1),'H'));
    //knights
    board[whiteBase][1].addPiece(new Knight(WHITE,(byte) (whiteBase+1),'B'));
    board[whiteBase][6].addPiece(new Knight(WHITE, (byte) (whiteBase+1),'G'));
    board[blackBase][1].addPiece(new Knight(BLACK, (byte) (blackBase+1),'B'));
    board[blackBase][6].addPiece(new Knight(BLACK, (byte) (blackBase+1),'G'));
    //bishops
    board[whiteBase][2].addPiece(new Bishop(WHITE, (byte) (whiteBase+1),'C'));
    board[whiteBase][5].addPiece(new Bishop(WHITE, (byte) (whiteBase+1),'F'));
    board[blackBase][2].addPiece(new Bishop(BLACK, (byte) (blackBase+1),'C'));
    board[blackBase][5].addPiece(new Bishop(BLACK, (byte) (blackBase+1),'F'));
    //queens
    board[whiteBase][3].addPiece(new Queen(WHITE, (byte) (whiteBase+1),'D'));
    board[blackBase][3].addPiece(new Queen(BLACK, (byte) (blackBase+1),'D'));
    //kings
    board[whiteBase][4].addPiece(new King(WHITE, (byte) (whiteBase+1),'E'));
    board[blackBase][4].addPiece(new King(BLACK, (byte) (blackBase+1),'E'));
  }
  private void emptyBoard(){
    for (int i=0;i< board.length;i++){
      for (int j=0; j<board[i].length;j++){
        this.board[i][j].removePiece();
      }
    }

  }
  private void createEmptyBoard(){
    for (int i=0;i< board.length;i++){
      for (int j=0; j<board[i].length;j++){
        this.board[i][j]=new BoardSquare(new BoardLocation((byte) (i+getMinRank()), (char) (getMinFile()+j)));
      }
    }
  }

  private Byte fileToByteConversion(char file){
    switch (file){
      case 'A' ->{
        return 0;
      }
      case 'B' ->{
        return 1;
      }
      case 'C' ->{
        return 2;
      }
      case 'D' ->{
        return 3;
      }
      case 'E' ->{
        return 4;
      }
      case 'F' ->{
        return 5;
      }
      case 'G' ->{
        return 6;
      }
      case 'H' ->{
        return 7;
      }
    }
    throw new IllegalArgumentException(file + " is not a file on the board");
  }

  public static byte getMaxRank() {
    return MAX_RANK;
  }

  public static byte getMinRank() {
    return MIN_RANK;
  }

  public static char getMaxFile() {
    return MAX_FILE;
  }

  public static char getMinFile() {
    return MIN_FILE;
  }
}
