public class TicTacToe {
  private char[][] board;
  private char currentPlayer;

  public TicTacToe() {
      board = new char[3][3];
      currentPlayer = 'X';
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              board[i][j] = ' ';
          }
      }
  }

  public void playGame() {
      playTurn();
  }

  private void playTurn() {

      int[] move = getInput();
      int row = move[0];
      int col = move[1];

      board[row][col] = currentPlayer;

      if (checkWin(currentPlayer)) {
          System.out.println("Player " + currentPlayer + " wins!");
          return;
      }
     

      playTurn();
  }


  private boolean checkWin(char player) {

      for (int i = 0; i < 3; i++) {
          if (checkRow(i, 0, player)) {
              return true;
          }
      }

      for (int i = 0; i < 3; i++) {
          if (checkColumn(0, i, player)) {
              return true;
          }
      }

      if (checkDiagonal(player)) {
          return true;
      }

      return false;
  }

  private boolean checkRow(int row, int col, char player) {
      if (col == 3) {
          return true;
      }
      if (board[row][col] != player) {
          return false;
      }
      return checkRow(row, col + 1, player);
  }

  private boolean checkColumn(int row, int col, char player) {
      if (row == 3) {
          return true;
      }
      if (board[row][col] != player) {
          return false;
      }
      return checkColumn(row + 1, col, player);
  }

  private boolean checkDiagonal(char player) {

      if (board[0][0] != player || board[1][1] != player || board[2][2] != player) {
          return false;
      }

       if (board[0][2] != player || board[1][1] != player || board[2][0] != player) {
          return false;
      }
      return true;
  }

  private int[] getInput() {  
      return new int[]{0, 0};
  }
  
}