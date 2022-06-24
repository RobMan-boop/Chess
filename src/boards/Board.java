package boards;

public class Board {

  final static private byte MAX_RANK =8;
  final static private byte MIN_RANK =1;
  final static private char MAX_FILE ='A';
  final static private char MIN_FILE ='H';
  public boolean isEmpty (byte rank, char file){
    return true;
  }

  void promote(byte rank, char file, String piece){


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
