// ----- MARK ANTHONY S. GOROY ------------//

public class Board

{

	private char[][] board;
	private char currentPlayerMark;

	// CONSTRUCTOR
	public Board()
	{
	board = new char[3][3];
	currentPlayerMark = 'x';
	initializeBoard();
	}

   //PLAYER MARK
    public char getCurrentPlayerMark()
    {
        return currentPlayerMark;
    }


    // EMPTY BOARD
    public void initializeBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }


    // DISPLAY BOARD
    public void printBoard() 
    {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    
    // CHECK BOARD IF FULL
    public boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }


    
    // CHECK FOR WIN
    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }


    // CHECK FOR WIN -- ROWS
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }


    // CHECK FOR WIN -- COLUMN
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }


    // CHECK FOR WIN -- DIAGONALS
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }


    // CHECK 3 VALUES IF THE SAME
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }


    // PALIT PLAYER
    public void changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
    }

    // LAGAY PAMATO
    public boolean placeMark(int row, int col) {

        
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }

        return false;
    }
}